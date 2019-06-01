package com.coderbd.ex5;

public class InsertEx {

    public static void main(String[] args) {
        /*
         The insert() method adds characters to the StringBuilder at the requested index and returns a reference to the current StringBuilder.

There are lots of method signatures for different types. Here's one:
StringBuilder insert(int offset, String str)
The offset is the index where we want to insert the requested parameter. 
         */
        StringBuilder sb = new StringBuilder("tasmia.com");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);
    }

}
