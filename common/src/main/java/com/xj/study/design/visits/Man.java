package com.xj.study.design.visits;

/**
 * 男人元素类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:47
 */
public class Man extends  People{

    @Override
    public String getName() {
        return "男人";
    }

    @Override
    public void accept(Action action) {
        action.visits(this);
    }
}
