package com.xj.study.socket.chat.tcp;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 09:28
 */
@Slf4j
public class ServerThread implements Runnable {

    private Socket serverSocket;

    private String username;

    private BufferedReader br= null;

    private BufferedWriter bw = null;

    private Integer count;

    public ServerThread(Socket serverSocket,int count) {
        if( null == serverSocket){
            log.error("socket connect failed!");
        }
        this.serverSocket = serverSocket;
        this.count = count;
    }

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        count++;
        lock.unlock();

        input();
        outPut();


    }

    /**
     * 打印到控制台
     */
    private void input(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(serverSocket.getInputStream());
                    br = new BufferedReader(inputStreamReader,5);

                    String temp = null;
                    while(true){
                        while((temp = br.readLine())!=null && temp.contains("end")){
                            System.out.println("第一次接受");
                            if( null !=username){
                                System.out.println(username+" 说："+temp);
                            }else{
                                System.out.println(temp+"已经登录");
                                username = temp;
                            }
                        }
                    }

                } catch (IOException e) {
                    log.error(serverSocket.getRemoteSocketAddress()+" connect get inputstream failed!");
                }
            }
        }).start();

    }

    private void outPut(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OutputStream osw = serverSocket.getOutputStream();
                    StringBuilder sb =null;
                    String temp = null;
                    while(true){
                        BufferedReader sys= new BufferedReader(new InputStreamReader(System.in));
                        sb = new StringBuilder();
                        while((temp = sys.readLine()) != null){
                            sb.append(temp);
                            if(temp.equals("end")){
                                break;
                            }
                        }
                        System.out.println(sb);
                        osw.write(sb.toString().getBytes("UTF-8"));
                        osw.flush();
                    }
                } catch (IOException e) {
                    log.error(serverSocket.getRemoteSocketAddress()+" connect get inputstream failed!");
                }
            }
        }).start();


    }

    private void destory() throws IOException {
        serverSocket.close();
    }
}
