package com.xj.study.design.visits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 观察者模式工具类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:56
 */
public class VisitsUtil {

    public static List<People> peoples = new ArrayList<>();

    public static void addElement(People people){
        peoples.add(people);
    }
    public static void remove(People people){
        Iterator<People> actionIterator = peoples.iterator();
        while(actionIterator.hasNext()){
            if(actionIterator == people){
                actionIterator.remove();
            }
        }
    }
    public static void show(Action action){
        Iterator<People> actionIterator = peoples.iterator();
        while(actionIterator.hasNext()){
            actionIterator.next().accept(action);
        }
    }


}
