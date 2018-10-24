package com.xj.study.socket.chat.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.channels.DatagramChannel;
import java.util.Arrays;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 15:51
 */
public class Accpter {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] b = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(b,b.length);
        socket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),"UTF-8"));
    }
}
