package com.xj.study.mq.nsq;

import com.github.brainlag.nsq.NSQProducer;
import com.xj.study.mq.MQProducer;
import com.xj.study.mq.MQMessage;
import com.xj.study.mq.MQConfig;
import com.xj.study.mq.exception.MQException;
import io.netty.util.internal.StringUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeoutException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 11:07
 * @Description: nsq 消费服务器
 */
@Slf4j
public class NSQMQProducerAdapter extends NSQProducer implements MQProducer {

    private MQConfig config;

    private boolean isDelay;

    public NSQMQProducerAdapter(MQConfig config) {
        this.config = config;
    }

    @Override
    public void provide(MQMessage message) throws MQException {
        checkMessage(message);
        try {
            this.produce(message.getTopic(), message.getContent().getBytes(getCharSet()));
        } catch (Exception e) {
            if (e instanceof UnsupportedEncodingException) {
                log.error("NSQProdecer send msg faild! because not supported the Encoding : " + this.getCharSet());
                throw new MQException("NSQProdecer send msg faild! because not supported the Encoding : " + this.getCharSet());
            } else if (e instanceof TimeoutException) {
                log.error("NSQProdecer send msg faild! because is timeout!");
                throw new MQException("NSQProdecer send msg faild! because is timeout!");
            }
            throw new MQException(e);
        }
    }

    @Override
    public void provide(MQMessage message, long delayTime) throws MQException {
        if(delayTime == 0){
            this.provide(message);
        }else{
            throw new MQException("NSQprodecer can't support the delay send message!");
        }
    }


    /**
     * 校验msg
     * @param message
     */
    private void checkMessage(MQMessage message){
        if (null == message || StringUtil.isNullOrEmpty(message.getContent())) {
            throw new MQException("NSQProdecer send msg is null!");
        }
        if (StringUtil.isNullOrEmpty(message.getTopic())) {
            if(StringUtil.isNullOrEmpty(this.config.getTopic())){
                throw new MQException("NSQProdecer send msg the topic is null!");
            }else{
                message.setTopic(this.config.getTopic());
            }

        }
    }

    /**
     * 添加生产地址
     */
    private void setAddress() {
        for (String url : config.getUrls()) {
            try {
                URI uri = new URI(url);
                this.addAddress(uri.getHost(), uri.getPort());
            } catch (URISyntaxException e) {
                throw new MQException("NSQProducer parse url failed: " + url, e);
            }
        }
    }
}
