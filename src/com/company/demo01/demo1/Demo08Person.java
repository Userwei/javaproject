package com.company.demo01.demo1;

public class Demo08Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = 18; //直接访问private内容，错误写法！
        person.setAge(20);
        person.show();
    }
}
