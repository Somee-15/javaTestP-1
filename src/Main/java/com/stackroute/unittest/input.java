package com.stackroute.unittest;

import java.util.Scanner;
public class input {
    public boolean validator(int num)
    {
        /*System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();*/
        if(num%2==0 && num>=20 && num<=30)
        {
            System.out.println("Jerry");
            return true;
        }
        else if(num%2!=0 && num>=20 && num<=30)
        {
            System.out.println("Tom");
            return true;
        }
        else
        {
            System.out.println("Enter a number between 20 and 30");
        }
        return false;
    }
}

