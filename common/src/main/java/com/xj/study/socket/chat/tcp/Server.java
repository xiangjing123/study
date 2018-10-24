package com.xj.study.socket.chat.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-12 10:18
 */
public class Server {

    public static void main(String[] args) throws IOException {
        Integer count = new Integer(0);
        ServerSocket server = new ServerSocket(3456);
        while(true){
            Socket socket = server.accept();
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 50,
                    0L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());
            poolExecutor.execute(new ServerThread(socket,count));
            System.out.println("客户端数量 count = "+ ++count);
        }
    }
}
