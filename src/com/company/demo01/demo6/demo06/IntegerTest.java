package com.company.demo01.demo6.demo06;

import java.util.Arrays;

public class IntegerTest {

    public static void main(String[] args) {

        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }

        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();

        System.out.println(result);
    }
}
