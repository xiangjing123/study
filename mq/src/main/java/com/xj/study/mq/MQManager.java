package com.xj.study.mq;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;
import com.xj.study.mq.nsq.TestConsumer;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 16:42
 */
public class MQManager {

    private static Map<String, List<Consumer>> maps = new ConcurrentHashMap<>();

    public static void register(Consumer consumer) {

       /* if (null != maps.get(consumer.getTopic())) {
            maps.put(consumer.getTopic(),consumer);
        }*/
    }

    public static void main(String[] args) {
        NSQLookup nsqLookup = new DefaultNSQLookup();
        nsqLookup.addLookupAddress("132.232.66.111",4161);
        TestConsumer consumer = new TestConsumer();
        NSQConsumer consumer1 = new NSQConsumer(nsqLookup,"test","default",new TestConsumer());
        consumer1.start();

    }
}
