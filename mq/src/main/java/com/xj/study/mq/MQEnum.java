package com.xj.study.mq;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 16:21
 */
public enum MQEnum {

    NSQ("nsq"),
    RABBIT_MQ("rabbitMQ"),
    ROCKET_MQ("rocketMQ"),
    KAFKA("kafka"),
    ACTIVE_MQ("activeMQ");

    private String msg;

    MQEnum(String msg) {
        this.msg = msg;
    }
}
