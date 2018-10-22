package com.xj.study.mq;

import com.xj.study.mq.exception.MQException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:56
 * @Description: 消息消费者
 */
@FunctionalInterface
public interface Consumer {

    boolean consumerMsg(MQMessage message) throws MQException;

    default String getTopic() {
        return "defaultTopic";
    }

    default String getSubTopic() {
        return "default";
    }

    default String getCharSet(){ return "UTF-8";}

}
