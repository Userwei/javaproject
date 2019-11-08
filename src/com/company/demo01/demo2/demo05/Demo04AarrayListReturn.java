package com.company.demo01.demo2.demo05;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
*/

import java.util.ArrayList;
import java.util.Random;

public class Demo04AarrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();   //  偶数
        ArrayList<Integer> listC = new ArrayList<>();   //  奇数
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            listA.add(num);
        }
        System.out.println("大集合中的数字是：" + listA);
        for (int i = 0; i < listA.size(); i++) {
            if(listA.get(i) % 2 == 0){
                listB.add(listA.get(i));
            }else{
                listC.add(listA.get(i));
            }
        }
        System.out.println("偶数集合中的数字是：" + listB);
        System.out.println("奇数集合中的数字是：" + listC);
    }
}
