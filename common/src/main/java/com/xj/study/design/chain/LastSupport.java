package com.xj.study.design.chain;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:34
 */
public class LastSupport extends ProblemSolver {
    @Override
    public void solverProblem(Proplem proplem) {
        System.out.println(getName() + ": 我已经把问题解决了");
    }

    @Override
    public boolean checkProplem(Proplem proplem) {
        return true;
    }

    @Override
    public String getName() {
        return "丁";
    }

}
