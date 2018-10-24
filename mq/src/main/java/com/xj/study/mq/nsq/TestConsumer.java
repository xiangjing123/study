package com.xj.study.mq.nsq;

import com.xj.study.mq.MQMessage;
import com.xj.study.mq.exception.MQException;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 16:46
 */
public class TestConsumer extends NSQConsumerAdapter {
    @Override
    public boolean consumerMsg(MQMessage message) throws MQException {
        System.out.println(message);
        return true;
    }

    @Override
    public String getTopic() {
        return "test";
    }
}
