package com.tgt.igniteplus;

public class StringRemoveDigit {
    public static void main(String[] args) {

        String str = "134-10/5566 A-block, Manyata Tech-Park";
        char[] chars = str.toCharArray();
        String str1 = "";
        for(int i = 0; i<chars.length;i++)
        {
            if(chars[i]!='-')
            {
                str1 = str1 + chars[i];
            }
        }
        System.out.println(str1);
    }
}
