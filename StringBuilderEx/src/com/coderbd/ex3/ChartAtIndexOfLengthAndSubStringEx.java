package com.coderbd.ex3;

public class ChartAtIndexOfLengthAndSubStringEx {

    /*
   charAt(), indexOf(), length(), and substring()
   These four methods work exactly the same as in the String class. 
     */
    public static void main(String[] argv) {
        StringBuilder sb = new StringBuilder("coderbd.com");
        String sub = sb.substring(sb.indexOf("r"), sb.indexOf("om"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
        /*
        substring() returns a String rather than a StringBuilder.
        That is why sb is not changed.
        The code above generates the following result.
         */
    }
}
