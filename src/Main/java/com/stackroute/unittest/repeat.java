package com.stackroute.unittest;

public class repeat {
    public boolean repeater(String str, int num) {
        System.out.print(str);
        int num1 = num;
        while (num != 0) {
            System.out.print(str.substring(str.length() - num1));
            num--;
        }
        return true;
    }
}
