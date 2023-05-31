package com.saiboke.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abe";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        String s3 = new String("abe");
        System.out.println(s3);
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String((chs));
        System.out.println(s4);

        byte[] bytes = {97,98,99,100,101};
        String s5 = new String(bytes);
        System.out.println(s5);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println("请输入用户名")；
    }
}
