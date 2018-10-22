package com.xj.study.mq.nsq;

import com.github.brainlag.nsq.NSQMessage;
import com.github.brainlag.nsq.callbacks.NSQMessageCallback;
import com.xj.study.mq.Consumer;
import com.xj.study.mq.MQMessage;
import com.xj.study.mq.exception.MQException;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 14:36
 */
@Slf4j
public abstract class NSQConsumerAdapter implements Consumer, NSQMessageCallback {

    @Override
    public void message(NSQMessage nsqMessage) {
        MQMessage mqMessage = new MQMessage();
        mqMessage.setMsgId(new String(nsqMessage.getId()));
        try {

            mqMessage.setContent(new String(nsqMessage.getMessage(), this.getCharSet()));
            mqMessage.setTopic(this.getTopic());
            mqMessage.setSubTopic(this.getSubTopic());
            mqMessage.setTimestamp(nsqMessage.getTimestamp().getTime());
            log.info("NSQConsumer accept the  message: "+mqMessage);
            this.consumerMsg(mqMessage);
        } catch (UnsupportedEncodingException e) {
            throw new MQException(mqMessage.getMsgId(),e);
        }
        nsqMessage.finished();
    }
}
