package com.xj.study.design.observer;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:16
 * @Description:
 */
public class OberserverImpl implements ObserverInterface {
    @Override
    public void onCommplete(Object obj) {
        System.out.println("我观察到你成功执行！");
    }

    @Override
    public void onError(Object obj) {
        System.out.println("我观察到你执行失败！");
    }
}
