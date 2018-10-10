package com.xj.study.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/10 0010 11:35
 * @Description:
 */
@Slf4j
@WebListener
public class GlobalListener implements ServletContextListener {

    private final  static Logger logger = LoggerFactory.getLogger(ServletContextListener.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("web context start");
        System.out.println("web context start");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("web context destroyed");
        System.out.println("web context destroyed");
    }
}
