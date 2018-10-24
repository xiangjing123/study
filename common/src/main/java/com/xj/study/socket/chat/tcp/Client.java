package com.xj.study.socket.chat.tcp;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 10:28
 */
@Slf4j
public class Client {

    private static BufferedReader br= null;

    private static BufferedWriter bw = null;


    public static void main(String[] args) throws Exception {

        Socket client = new Socket("localhost",3456);
        outPut(client);
        input(client);

    }
    /**
     * 打印到控制台
     */
    private static void input(Socket socket){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                    br = new BufferedReader(inputStreamReader);
                    String temp = null;
                    while(true){
                        while((temp = br.readLine())!=null && temp.contains("end")){
                            System.out.println(" 服务器说："+temp);

                        }
                    }

                } catch (IOException e) {
                    log.error(socket.getRemoteSocketAddress()+" connect get inputstream failed!");
                }
            }
        }).start();

    }

    private static void outPut(Socket socket){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("输出线程开始！");
                    OutputStream os =  socket.getOutputStream();
                    StringBuilder sb = null;
                    String temp = null;
                    while(true){

                        BufferedReader sys= new BufferedReader(new InputStreamReader(System.in));

                        sb = new StringBuilder();
                        while((temp=sys.readLine())!=null) {
                            os.write((temp+"\n").getBytes("UTF-8"));

                            os.flush();
                            socket.shutdownOutput();
                            if(temp.equals("end")) {
                                break;
                            }
                        }

                    }
                } catch (IOException e) {
                    log.error(socket.getRemoteSocketAddress()+" connect get inputstream failed!");
                }
            }
        }).start();


    }

    private static void destory(Socket socket) throws IOException {
        socket.close();
    }

}
