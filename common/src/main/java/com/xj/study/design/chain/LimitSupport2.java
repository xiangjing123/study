package com.xj.study.design.chain;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:34
 */
public class LimitSupport2 extends ProblemSolver {
    @Override
    public void solverProblem(Proplem proplem) {
        System.out.println(getName() + ": 我已经把问题解决了");
    }

    @Override
    public boolean checkProplem(Proplem proplem) {
        if (proplem.getCode() > 10 && proplem.getCode() < 20) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "丙";
    }

    @Override
    public void setNextSolver(ProblemSolver nextSolver) {
        super.setNextSolver(new LastSupport());
    }
}
