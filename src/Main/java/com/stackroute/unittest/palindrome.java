package com.stackroute.unittest;

import java.util.Scanner;
public class palindrome {
    public long palcheck(long num2)
    {
        long num1=num2;
        long rev=0;
        long sum=0;
        while(num2!=0)
        {
            long rem=num2%10;
            num2=num2/10;
            rev=(10*rev)+rem;

        }
        if(num1==rev)
        {
            System.out.println("The number is a pallindrome");
            while(num1!=0)
            {
                long rem1=num1%10;
                num1=num1/10;
                if(rem1%2==0)
                {
                    sum=sum+rem1;
                }

            }
            if(sum>25)
            {
                System.out.println("The sum of the numbers is greater than 25");
                System.out.println("The sum of the even digits is:"+sum);
            }
            else
            {
                System.out.println("The sum is less than 25");
            }

        }
        else
        {
            System.out.println("The number is not a pallindrome");


        }
        return rev;
    }
}
