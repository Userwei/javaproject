package com.company.demo01.demo5.demo01;


public interface MyInterfacePrivateB {

    static void methodStatic1(){
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    static void methodStatic2(){
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
