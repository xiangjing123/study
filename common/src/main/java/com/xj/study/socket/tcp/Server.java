package com.xj.study.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 08:55
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3456);
        Socket socket = server.accept();
        InputStreamReader is = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(is);
        String temp = null;
        while((temp = br.readLine())!=null ){
            System.out.println(temp);
        }
        socket.shutdownInput();
       OutputStream os= socket.getOutputStream();os.write("欢迎您！".getBytes("UTF-8"));
       os.flush();
       socket.shutdownOutput();

       server.close();

    }
}
