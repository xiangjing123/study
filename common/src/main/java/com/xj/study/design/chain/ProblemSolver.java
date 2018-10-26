package com.xj.study.design.chain;

/**
 * 问题解决者
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:23
 */
public abstract class ProblemSolver {

    private ProblemSolver nextSolver;

    private String name;


    public void handleProplem(Proplem proplem) {
        if (checkProplem(proplem)) {
            solverProblem(proplem);
        } else {
            notSuport();
            setNextSolver(this);
            this.nextSolver.handleProplem(proplem);
        }
    }

    /* 解决问题*/
    public abstract void solverProblem(Proplem proplem);

    public abstract boolean checkProplem(Proplem proplem);

    /**
     * 不能解决问题
     */
    public void notSuport() {
        System.out.println(getName() + " : we can't solver the proplem");
    }

    public ProblemSolver getNextSolver() {
        return nextSolver;
    }

    public void setNextSolver(ProblemSolver nextSolver) {
        this.nextSolver = nextSolver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
