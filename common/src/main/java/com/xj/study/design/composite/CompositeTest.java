package com.xj.study.design.composite;

/**
 * 组合模式测试类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 11:38
 */
public class CompositeTest {

    public static void main(String[] args) {

        Directory rootDir = new Directory("root", 0);
        Directory user = new Directory("user", 0);
        Directory user1 = new Directory("user1", 0);
        Directory ces = new Directory("ces", 0);

        rootDir.add(user).add(user1).add(ces);
        FileClass fileClass = new FileClass("test.text", 200);
        FileClass fileClass1 = new FileClass("test2.text", 400);
        FileClass fileClass2 = new FileClass("test3.text", 300);

        user.add(fileClass).add(fileClass1);
        user1.add(fileClass2);
        rootDir.printList();
       // user.printList();
    }
}
