package com.company.demo01.demo6.demo06;

public class IntegerDemo {

    public static void main(String[] args) {
        /*System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        Integer i1 = new Integer(100);
//        System.out.println(i1);
//
//        Integer i2 = new Integer("100");
//        System.out.println(i2);
//
////        Integer i2 = new Integer("abc");
////        System.out.println(i2);*/

//        Integer i1 = Integer.valueOf(100);
//        System.out.println(i1);
//
//        Integer i2 = Integer.valueOf("100");
//        System.out.println(i2);

        //int --- String
        int num = 100;
        //方式1
        String s1 = "" + num;
        System.out.println(s1);

        //方式2
        //public static String valueOf​(int i)
        String s2 = String.valueOf(num);
        System.out.println(s2);
        System.out.println("==================");

        //String --- int
        String s = "100";
        //方式1
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式2
        //public static int parseInt​(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
