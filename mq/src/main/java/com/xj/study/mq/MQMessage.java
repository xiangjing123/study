package com.xj.study.mq;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 11:01
 * @Description: 消息
 */
@Setter
@Getter
public class MQMessage {

    private  String msgId;

    private String topic;

    private String subTopic;

    private String content;

    private long timestamp;

    private int status;


    @Override
    public String toString() {
        return "MQMessage{" +
                "msgId='" + msgId + '\'' +
                ", topic='" + topic + '\'' +
                ", subTopic='" + subTopic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
