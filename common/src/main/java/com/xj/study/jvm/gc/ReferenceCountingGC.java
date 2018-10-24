package com.xj.study.jvm.gc;

import java.lang.ref.SoftReference;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-19 11:31
 */
public class ReferenceCountingGC {

    public Object instace = null;

    private static final  int _1MB = 1024*1024;

    private byte[] bi = new byte[_1MB];

    public static void main(String[] args) {

        ReferenceCountingGC referA = new ReferenceCountingGC();
        ReferenceCountingGC referB = new ReferenceCountingGC();
        referA.instace = referB;
        referB.instace = referA;
        referA = null ;
        referB = null ;
        System.gc();


    }
}
