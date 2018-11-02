package com.xj.study.mq;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:59
 * @Description: 消息服务器配置
 */
@Setter
@Getter
public class MQConfig implements Serializable {

    private static final long serialVersionUID = 8468460050522559446L;

    private List<String> urls = new ArrayList<>();

    private List<String> takeUrl;

    private String topic;

    private String subTopic;

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getTakeUrl() {
        return takeUrl;
    }

    public void setTakeUrl(List<String> takeUrl) {
        this.takeUrl = takeUrl;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public MQConfig addUrl(String url) {
        urls.add(url);
        return this;
    }
}
