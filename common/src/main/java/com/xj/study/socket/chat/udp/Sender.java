package com.xj.study.socket.chat.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.Arrays;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 15:44
 */
public class Sender {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10086);
        String myData= new String("this is my first UDP 包");
        DatagramPacket packet = new DatagramPacket(myData.getBytes("UTF-8"),myData.getBytes("UTF-8").length, InetAddress.getLocalHost(),9090);
        socket.send(packet);
        socket.close();

    }
}
