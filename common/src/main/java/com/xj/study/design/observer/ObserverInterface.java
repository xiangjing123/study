package com.xj.study.design.observer;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:10
 * @Description:
 */
public interface ObserverInterface {

    void onCommplete(Object obj);

    void onError(Object obj);
}
