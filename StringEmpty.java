package com.tgt.igniteplus;

public class StringEmpty {
    public static void main(String args[]) {
        String s1 = "welcome to java";
        String s2 = "";
        if(s1.isEmpty())
        {
            System.out.println("string s1 is empty");
        }
        else {
            System.out.println(s1);
        }
        if(s2.isEmpty())
        {
            System.out.println("string s2 is empty");
        }
        else {
            System.out.println(s2);
        }
    }
}
