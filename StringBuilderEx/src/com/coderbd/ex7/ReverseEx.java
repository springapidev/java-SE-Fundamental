package com.coderbd.ex7;

public class ReverseEx {

    public static void main(String[] args) {
        /*
The reverse() method reverses the characters in the sequences and returns a reference to the current StringBuilder.
The method signature is as follows:
StringBuilder reverse() 
         */
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);
    }
}
