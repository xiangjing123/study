package com.xj.study.mq.config;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 11:01
 * @Description: 消息
 */
@Data
public class Message {

    private  String msgId;

    private String topic;

    private String subTopic;

    private String content;

    private int status;


}
