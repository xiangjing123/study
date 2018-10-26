package com.xj.study.design.visits;

/**
 * 访问者模式测试
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:53
 */
public class VisitsTest {

    public static void main(String[] args) {



        People man =  new Man();
        People woman =  new WoMan();

        VisitsUtil.addElement(man);
        VisitsUtil.addElement(woman);

        VisitsUtil.show(new SuccessAction());
        VisitsUtil.show(new FailedAction());
        VisitsUtil.show(new LovelornAction());




    }
}
