package com.stackroute.unittest;
import java.util.Scanner;
public class Symbol {
    public boolean symbolchecker(char c)
    {

        if(c>=48 && c<=57){
            System.out.println("Character "+c+" is a number");
            return true;

        }
        else if(c>=65 && c<=90){
            System.out.println("Character "+c+" is a capital alphabet");
            return true;
        }
        else if(c>=97 && c<=122){
            System.out.println("Character "+c+" is a small alphabet");
            return true;
        }
        else {
            System.out.println("Character "+c+" is a special charater");

        }
        return true;

    }
}