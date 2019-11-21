package com.company.demo01.demo7.demo03;

import java.util.*;

public class TreeSetDemo {


    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();
//
//        map.put("04170615", "卫仁杰");
//        map.put("04170618", "刘超");
//        map.put("04170622", "孙子康");
//
//        System.out.println(map.containsValue("孙子康"));

//        Set<String> keySet = map.keySet();
//        for(String key:keySet){
//            System.out.println(key);
//        }
//
//        Collection<String> values = map.values();
//        for(String value:values){
//            System.out.println(value);
//        }


//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        for (Map.Entry<String, String> me : entrySet) {
//            String key = me.getKey();
//            String value = me.getValue();
//            System.out.println(key + "," + value);
//        }
//
//
//        System.out.println(map);

        HashMap<String, Student> hm = new HashMap<String, Student>();

        Student s1 = new Student("刘超", 30);
        Student s2 = new Student("孙子康", 20);
        Student s3 = new Student("卫仁杰", 18);

        hm.put("04170622", s1);
        hm.put("04170618", s2);
        hm.put("04170615", s3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

        System.out.println("=========================");
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

    }
}
