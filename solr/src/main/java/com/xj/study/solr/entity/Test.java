package com.xj.study.solr.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-18 16:35
 */
public class Test {

    public static int count = 0;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja2").append("va").toString();
        System.out.println(str2.intern() == str2);

    }

}
