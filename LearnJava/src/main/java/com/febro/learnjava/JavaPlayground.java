package com.febro.learnjava;

public class JavaPlayground {

    public static void main(String[] args) {
        double count = 999;

       int []myArr = {10, 20};
       int sum = 0;
       for(int x = 0; x <= myArr.length; x++) {
           sum += myArr[x];
       }

        System.out.println(sum);
    }
}