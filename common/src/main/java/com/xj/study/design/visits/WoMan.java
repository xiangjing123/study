package com.xj.study.design.visits;

/**
 * 女人
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:49
 */
public class WoMan extends People{

    @Override
    public String getName() {
        return "女人";
    }

    @Override
    public void accept(Action action) {
        action.visits(this);
    }
}
