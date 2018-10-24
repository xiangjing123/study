package com.xj.study.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 09:02
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",3456);
        OutputStream os = client.getOutputStream();
        os.write("helloworld".getBytes("UTF-8"));
        os.flush();
        client.shutdownOutput();
       InputStreamReader isr = new InputStreamReader(client.getInputStream()) ;
        BufferedReader br = new BufferedReader(isr);
        String temp = null;
        while((temp = br.readLine()) !=null){
            System.out.println(temp);
        }
        client.shutdownInput();

        client.close();
    }
}
