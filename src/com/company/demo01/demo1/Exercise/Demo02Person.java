package com.company.demo01.demo1.Exercise;

public class Demo02Person {

    public static void main(String[] args) {
        Person person = new Person();
        //设置我自己的名字
        person.name = "王健林";
        person.sayHello("王思聪");

        System.out.println(person);//   地址值
    }
}
