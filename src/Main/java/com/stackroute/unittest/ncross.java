package com.stackroute.unittest;


public class ncross {
    public boolean cross(int num) {
        for (int i = 1; i <= num; i++) {
            int j = i;
            while (j <= i) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(j);
                }
                j++;
            }
        }
        return true;
    }
}
