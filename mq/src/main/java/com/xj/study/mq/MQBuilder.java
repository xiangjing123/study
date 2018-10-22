package com.xj.study.mq;

import com.xj.study.mq.exception.MQException;
import com.xj.study.mq.nsq.NSQMQProducerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 16:26
 */
@Slf4j
public class MQBuilder {

    private static MQConfig config;

    public MQBuilder(MQConfig config) {
        config = config;
    }

    /**
     * 发送消息
     * @param message
     * @param type
     */
    public void provid(MQMessage message, MQEnum type) {
        switch (type) {
            case NSQ:
                BuilderMQ.producter.provide(message);
                break;
            default:
                log.error("there is not other mq realize!");
                throw new MQException("there is not other mq realize!");
        }
    }

    private static class BuilderMQ {
        public static final NSQMQProducerAdapter producter = new NSQMQProducerAdapter(config);
    }

    public static MQConfig getConfig() {
        return config;
    }

    public static void setConfig(MQConfig config) {
        MQBuilder.config = config;
    }
}
