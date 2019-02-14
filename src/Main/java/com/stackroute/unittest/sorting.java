package com.stackroute.unittest;

public class sorting {
    public boolean sort(int num) {

        int sum = 0;
        char[] c = ("" + num).toCharArray();

        int n = c.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k]);


        }
        System.out.println();
        int number = Integer.parseInt(new String(c));
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
        }
        System.out.println("Sum of even numbers is" + sum);
        if (sum > 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return true;
    }
}
