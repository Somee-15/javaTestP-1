package com.stackroute.unittest;

import java.util.Scanner;
public class stringReverse {
public boolean reverse(String str)
    {
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length/2;i++)
        {
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        return true;
    }
}
