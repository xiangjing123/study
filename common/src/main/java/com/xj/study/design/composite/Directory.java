package com.xj.study.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目录
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 11:15
 */
public class Directory implements Entrty {

    private String name;

    private int size;

    private List<Entrty> entrtyList = new ArrayList();

    public Directory(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int count = size;
        Iterator<Entrty> iterator = entrtyList.iterator();
        while(iterator.hasNext()){
            Entrty entrty = iterator.next();
            count +=entrty.getSize();
        }
        return count;
    }

    @Override
    public Entrty add(Entrty entrty) {
        entrtyList.add(entrty);
        return this;
    }

    @Override
    public void printList() {
        printList("");
    }

    @Override
    public void printList(String file) {
        System.out.println(file+"/"+this.name+String.format("\t(%s)",this.getSize()));
        Iterator<Entrty> iterator = entrtyList.iterator();
        while(iterator.hasNext()){
            Entrty entrty = iterator.next();
            entrty.printList(file+"/"+this.name);
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
