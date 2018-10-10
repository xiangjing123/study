package com.xj.study.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/10 0010 15:49
 * @Description:
 */
@WebListener
public class AsyncLintener implements AsyncListener {
    @Override
    public void onComplete(AsyncEvent asyncEvent) throws IOException {

        System.out.println("AsyncLintener onComplete");
    }

    @Override
    public void onTimeout(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AsyncLintener timeout");
        asyncEvent.getSuppliedResponse().getWriter().print("异步调用超时间！");
    }

    @Override
    public void onError(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AsyncLintener error");
        asyncEvent.getSuppliedResponse().getWriter().print("异步调用失败！");
    }

    @Override
    public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
        System.out.println("AsyncLintener is start");

    }
}
