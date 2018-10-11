package com.xj.study.design.observer;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:13
 * @Description:
 */
public interface ObservableInterface {

    void registerObserver(ObserverInterface observer);

    void removeObserver(ObserverInterface observer);

    void notifyObserver(int code);
}
