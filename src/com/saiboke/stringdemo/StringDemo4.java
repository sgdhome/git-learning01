package com.saiboke.stringdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //用户登录
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登陆成功");
                break;
            }else{
                if(i == 2){
                    System.out.println("账号" + username + "被锁定，请联系客服");
                }else{
                    System.out.println("用户登陆失败，用户名或密码有误, 您还剩下" + (2-i) + "次机会");
                }
            }
        }
    }

}
