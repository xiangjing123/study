package com.xj.study.design.observer;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:26
 * @Description:
 */
public class TestObserver {
    public static void main(String[] args) {
        OberserverImpl is = new OberserverImpl();
        ObservableImpl im = new ObservableImpl();
        im.registerObserver(is);
        im.handle();
    }
}
