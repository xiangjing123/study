package com.xj.study.mq;

import com.xj.study.mq.config.Message;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:56
 * @Description: 消息消费者
 */
public interface Consumer {

    Boolean consumerMsg(Message message);
}
