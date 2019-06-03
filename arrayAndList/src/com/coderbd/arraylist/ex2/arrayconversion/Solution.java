/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arraylist.ex2.arrayconversion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("cat");
        al.add("dog");
        al.add("rat");

        // Print the content of arrayList
        System.out.println("ArrayList:" + al);
        // 
        // Create an array of the same length as the ArrayList
        String[] s1 = new String[al.size()];

        // Copy the ArrayList elements to the array
        String[] s2 = al.toArray(s1);

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));

        // Create an array of string with 1 element.
        s1 = new String[1];
        s1[0] = "hello"; // Store hello in first element

        // Copy ArrayList to the array s1
        s2 = al.toArray(s1);

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));
    }
}
