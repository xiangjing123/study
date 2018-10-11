package com.xj.study.mq.config;

import lombok.Data;

import java.util.List;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:59
 * @Description: 消息服务器配置
 */
@Data
public class MsgConfig {

    private List<String> producterUrl;

    private List<String> consumerUrl;

    private String topic;

    private String subTopic;


}
