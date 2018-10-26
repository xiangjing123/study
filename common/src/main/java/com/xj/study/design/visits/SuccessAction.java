package com.xj.study.design.visits;

/**
 * 成功操作实现类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:50
 */
public class SuccessAction implements Action {
    @Override
    public void visits(Man man) {
        System.out.println(man.getName()+getHandle()+"时，背后一定有个女人！");
    }

    @Override
    public void visits(WoMan man) {
        System.out.println(man.getName()+getHandle()+"时，背后一定有个男人！");
    }

    @Override
    public String getHandle() {
        return "成功";
    }
}
