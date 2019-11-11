package com.company.demo01.demo4.demo13;

//  子类也是一个抽象类
public abstract class Dog  extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
