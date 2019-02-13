package com.stackroute.unittest;

import java.util.Scanner;
public class guess {
    public boolean guessing(int num)
    {

        if(num<0 || num>100)
        {
            System.out.println("Please enter a number between 1 and 100");
            return false;
        }
        int a=25;
        if(num==a)
        {
            System.out.println("Number guessed matches the original number");
            return true;
        }
        else if(num>a)
        {
            System.out.println("Number guessed is more than the original number");
            return false;
        }
        else
        {
            System.out.println("Number guessed is less than the original number");
            return false;
        }

    }
}
