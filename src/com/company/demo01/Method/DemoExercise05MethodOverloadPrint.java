package com.company.demo01.Method;


//byte short int long float char boolean
//string
//在调用输出语句的时候，println其实就是进行了多种数据类型的重载形式。

public class DemoExercise05MethodOverloadPrint {
    public static void main(String[] args) {
        myPrint(100);// int
        myPrint("Hello");//String
    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }

}
