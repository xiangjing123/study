package com.xj.study.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/11 0011 10:17
 * @Description:
 */
public class ObservableImpl implements ObservableInterface,HandleInterface {

    private List<ObserverInterface> observers = new ArrayList();

    @Override
    public void registerObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        Iterator<ObserverInterface> it = observers.iterator();
        while (it.hasNext()) {
            if (it.next() == observer) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public void notifyObserver(int code) {
        switch (code) {
            case 200:
                for (ObserverInterface observer : observers) {
                    observer.onCommplete(null);
                }
                break;
            case 400:
                for (ObserverInterface observer : observers) {
                    observer.onError(null);
                }
                break;
                default:
        }
    }

    @Override
    public void handle() {
        System.out.println("Im handel!");
        notifyObserver(200);
    }
}
