package com.xj.study.design.builder;

/**
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:46
 */
public class TextBuilder {

    private Print print;

    public TextBuilder(Print print) {
        this.print = print;
    }

    public void printText(){
        print.printTitle("早上");
        print.printContent("白天");
        print.printFooter();
    }

}
