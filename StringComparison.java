package com.tgt.igniteplus;

public class StringComparison {
    public static void main(String args[]) {
        String s1 = "target";
        String s2 = "TARGET";
        String s3 = "Target";
        String s4 = new String("target");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
