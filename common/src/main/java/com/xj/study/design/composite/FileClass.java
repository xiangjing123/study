package com.xj.study.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *  文件类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 11:33
 */
public class FileClass implements Entrty {

    private String name;

    private int size;


    public FileClass(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Entrty add(Entrty entrty) {
        throw new RuntimeException("file can't add file");
    }

    @Override
    public void printList() {
        printList("");
    }

    @Override
    public void printList(String file) {
        System.out.println(file+"/"+this.name+String.format("\t(%s)",this.getSize()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
