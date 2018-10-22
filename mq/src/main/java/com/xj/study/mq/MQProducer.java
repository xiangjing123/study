package com.xj.study.mq;

import com.xj.study.mq.exception.MQException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:55
 * @Description: 消息生产者
 */
public interface MQProducer {

    void provide(MQMessage message) throws MQException;

    void provide(MQMessage message, long delayTime) throws MQException;

    default String getCharSet(){ return "UTF-8";}

}
