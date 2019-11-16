package com.company.demo01.demo7.demo02;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;//注意细节！
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        c.set(2019, 1, 11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);//注意细节！
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
