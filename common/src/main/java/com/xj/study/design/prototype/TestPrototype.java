package com.xj.study.design.prototype;

/**
 * 测试原型模式
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 15:13
 */
public class TestPrototype {

    private static User user = new User();

    public static void shallowClone() {
        user.setId(2);
        user.setName("孙悟空");
        user.setAge(507);
        user.setGrade(new Grade("数学", 98D));

        User userClone = (User) user.clone();

        System.out.println(userClone);

        System.out.println("本尊和克隆是否相等：" + (user == userClone));
        System.out.println("本尊和克隆成绩是否相等：" + (user.getGrade() == userClone.getGrade()));
    }

    public static void main(String[] args) {
        //deployClone();
        shallowClone();

    }

    public static void deployClone() {
        user.setId(2);
        user.setName("孙悟空");
        user.setAge(507);
        user.setGrade(new Grade("数学", 98D));

        User userClone = (User) user.deployClone();

        System.out.println(userClone);

        System.out.println("本尊和克隆是否相等：" + (user == userClone));
        System.out.println("本尊和克隆成绩是否相等：" + (user.getGrade() == userClone.getGrade()));
    }
}
