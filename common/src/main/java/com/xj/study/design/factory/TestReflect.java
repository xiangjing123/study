package com.xj.study.design.factory;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 09:49
 */
public class TestReflect {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class classz = Class.forName("com.xj.study.design.factory.DogFactory");
        Object object = classz.newInstance();
        if(object instanceof Factory){
            Factory factory = (Factory) object;
            factory.getFactory().printName();
        }
    }
}
