package com.coderbd.ex4;

public class AppendEx {

    public static void main(String[] args) {
        /*
    append() method adds the parameter to the StringBuilder and returns a reference to the current StringBuilder.
One of the method signatures is as follows:
StringBuilder append(String str) 

There are more than 10 method signatures that look similar but that take different data types as parameters.
All those methods are provided so you can write code like this: 
         */
        StringBuilder sb = new StringBuilder().append(1).append('c').append("Tasmia").append(2500.0);
        sb.append("-").append(true);
        System.out.println(sb);      // 1cTasmia2500.0-true
    }
}
