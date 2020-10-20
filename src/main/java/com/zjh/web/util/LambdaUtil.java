package com.zjh.web.util;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaUtil {

    public static void main(String[] args) {

    }


    public static void test(){

        //匿名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> set = new TreeSet<>(cpt);

        System.out.println("=========================");

        //使用lambda表达式
        Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set2 = new TreeSet<>(cpt2);
        System.out.println();

    }
}
