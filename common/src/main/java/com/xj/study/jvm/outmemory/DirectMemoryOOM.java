package com.xj.study.jvm.outmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *
 * jvm 直接内存溢出
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-19 11:09
 */
public class DirectMemoryOOM {

    private static final int MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(MB);
        }
    }
}
