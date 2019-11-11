package com.company.demo01.demo4.demo11;

public class Zi extends Fu {

    public Zi(){
        //  super();
        System.out.println("子类构造方法执行！");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
