package com.xj.study.design.builder;

/**
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:50
 */
public class StringPrint extends Print {
    @Override
    public void printTitle(String title) {
        System.out.println(String.format("*************%s***********",title));
    }

    @Override
    public void printContent(String content) {
        System.out.println("\t"+content+"\t");
    }

    @Override
    public void printFooter() {
        System.out.println("*************end***********");
    }
}
