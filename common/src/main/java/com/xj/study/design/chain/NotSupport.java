package com.xj.study.design.chain;

/**
 * 不能解决问题
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:32
 */
public class NotSupport extends ProblemSolver {
    @Override
    public void solverProblem(Proplem proplem) {

    }

    @Override
    public boolean checkProplem(Proplem proplem) {
        return false;
    }

    @Override
    public String getName() {
        return "甲";
    }

    @Override
    public void setNextSolver(ProblemSolver nextSolver) {
        super.setNextSolver(new LimitSupport());
    }
}
