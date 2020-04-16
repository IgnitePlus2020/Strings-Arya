package com.tgt.igniteplus;

public class StringSize {
    public static void main(String args[]) {
        String s1 = "welcome to java";
        String s2 = "";
        if(s1.length() > 0) {
            System.out.println("strings s1 length is: "+s1.length());
        }
        else {
            System.out.println("string s1 is empty");
        }
        if(s2.length()>0) {
            System.out.println("string s2 length is :"+s2.length());
        }
        else {
            System.out.println("string s2 is empty");
        }
    }
}
