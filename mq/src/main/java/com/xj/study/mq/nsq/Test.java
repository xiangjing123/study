package com.xj.study.mq.nsq;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;
import com.xj.study.mq.MQConfig;
import com.xj.study.mq.MQMessage;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-29 11:21
 */
public class Test {

    public static void main(String[] args) {
       /* MQConfig mqConfig  = new MQConfig();
        mqConfig.addUrl("http://132.232.66.111:4150").addUrl("http://132.232.66.111:4157");
        mqConfig.setTopic("TEST_COLONY");
        NSQMQProducerAdapter producerAdapter = new NSQMQProducerAdapter(mqConfig);
        MQMessage mqMessage = new MQMessage();
        producerAdapter.start();
        mqMessage.setContent("测试 集群发送!");
        producerAdapter.provide(mqMessage);*/
        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("132.232.66.111",4161);
        //lookup.addLookupAddress("132.232.66.111",4157);
        NSQConsumer consumer = new NSQConsumer(lookup,"TEST_COLONY","default",new TestConsumer());
        consumer.start();


    }
}
