package com.xj.study.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/10 0010 13:56
 * @Description:
 */
@Slf4j
@WebListener
public class SessionListener implements HttpSessionListener {

    private int count=0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
        log.info("session is add ,now session number is "+count);
        System.out.println("session is add ,now session number is "+count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count--;
        log.info("session is delete,now session number is "+count);
        System.out.println("session is delete,now session number is "+count);

    }
}
