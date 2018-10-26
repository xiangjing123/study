package com.xj.study.design.visits;

/**
 * 失恋
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:07
 */
public class LovelornAction implements Action {
    @Override
    public void visits(Man man) {
        System.out.println(man.getName()+getHandle()+"时，背后一定有个坏的女人！");
    }

    @Override
    public void visits(WoMan man) {
        System.out.println(man.getName()+getHandle()+"时，背后一定有个坏的男人！");
    }

    @Override
    public String getHandle() {
        return "失恋";
    }
}
