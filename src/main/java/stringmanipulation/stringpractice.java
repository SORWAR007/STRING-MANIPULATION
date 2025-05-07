package stringmanipulation;

import java.util.Arrays;

public class stringpractice {

    public static void main(String[] args) {

        String st="i love my country very much";
       char [] ch=(st.toCharArray());
        System.out.println(Arrays.toString(ch)); //for printing array
        System.out.println(ch.length);
        System.out.println(ch[5]);
        System.out.println(st.indexOf("c"));
         int s=st.indexOf("c");
         int t=s+7;
         System.out.println(st.substring(s,t));
         String s1="my";
        System.out.println(st.contains(s1));
        String []words=st.split(" ");
        System.out.println(words[2]);
    }
}

