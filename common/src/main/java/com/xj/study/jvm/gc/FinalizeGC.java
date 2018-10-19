package com.xj.study.jvm.gc;

/**
 * TODO
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-19 11:52
 */
public class FinalizeGC {

    private  static  FinalizeGC  look = null;

    public void isAlive(){
        System.out.println(" yes im is stave alive!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(" finalize is executer");
        look = this;
    }

    public static void main(String[] args) {
        FinalizeGC gc = new FinalizeGC();

    }
}
