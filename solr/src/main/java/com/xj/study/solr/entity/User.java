package com.xj.study.solr.entity;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-18 14:55
 */
public class User implements Serializable {

    private static final long serialVersionUID = -3725455075737800159L;

    @Field
    private String id;

    @Field
    private String name;

    @Field
    private Integer age;

    @Field
    private Integer sex;

    @Field
    private String desc;

    public User() {
    }

    public User(String id, String name, Integer age, Integer sex, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.desc = desc;
    }

    public User(String name, Integer age, Integer sex, String desc) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    static {
        System.out.println("类信息被加载");
    }


    public static void main(String[] args) {
        System.out.println("main 方法被加载");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", desc='" + desc + '\'' +
                '}';
    }
}
