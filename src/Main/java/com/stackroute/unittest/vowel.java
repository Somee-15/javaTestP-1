package com.stackroute.unittest;


public class vowel {
    public boolean vowelChecker(String str) {
        int i;
        char[] arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if ((arr[i] >= 48 && arr[i] <= 57) || (arr[i] >= 58 && arr[i] <= 64) || (arr[i] >= 91 && arr[i] <= 95)) {
                System.out.println("Error.Please enter an alphabet string only");
                return true;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                System.out.println("Character  " + arr[i] + " is a Vowel");
            } else {
                System.out.println("Character  " + arr[i] + " is a Consonant");
            }

        }
        return true;
    }
}
