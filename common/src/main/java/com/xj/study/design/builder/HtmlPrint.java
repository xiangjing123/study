package com.xj.study.design.builder;

/**
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:50
 */
public class HtmlPrint extends Print {
    @Override
    public void printTitle(String title) {
        System.out.println("<html>");
        System.out.println(String.format("<title>%s</title>",title));
    }

    @Override
    public void printContent(String content) {
        System.out.println(String.format("<div>%s</div>",content));
    }

    @Override
    public void printFooter() {
        System.out.println("</html>");
    }
}
