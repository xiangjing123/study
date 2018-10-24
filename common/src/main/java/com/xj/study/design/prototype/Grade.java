package com.xj.study.design.prototype;

import java.io.Serializable;

/**
 * grade
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 15:18
 */
public class Grade implements Serializable {

    private static final long serialVersionUID = 43502273754340679L;

    private String className;

    private Double grade;


    public Grade(String className, Double grade) {
        this.className = className;
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "className='" + className + '\'' +
                ", grade=" + grade +
                '}';
    }
}
