package com.xj.study.mq.nsq;

import com.github.brainlag.nsq.exceptions.NSQException;
import com.xj.study.mq.Producer;
import com.xj.study.mq.config.MsgConfig;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 11:07
 * @Description: nsq 消费服务器
 */
public class NSQProducerAdapter implements Producer {

    private MsgConfig config;

    public NSQProducerAdapter(MsgConfig config) {
        this.config = config;
    }

    @Override
    public void createProducer(String msg) {
        com.github.brainlag.nsq.NSQProducer producer = new com.github.brainlag.nsq.NSQProducer();
        producer.start();
        producer.addAddress("132.232.66.111", 4157);
        try {
            producer.produce("test", msg.getBytes("utf-8"));
        } catch (NSQException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        NSQProducerAdapter adapter = new NSQProducerAdapter(null);
        adapter.createProducer("测试消息");

    }
}
