package com.tgt.igniteplus;


public class StringsRemoveChar {

        public static void main(String[] args)
        {
           String x = "To test this string";
            x = x.toLowerCase();
           char arr[] = x.toCharArray();
           int size = x.length();
           char key = 't';
           int i = 0;
           String result = "";
           while(i != size)
           {
               if(arr[i] != key)
               {
                   result = result + arr[i];
               }
               ++i;
           }
            System.out.println(result);
        }
    }
