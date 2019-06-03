/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arraylist.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] args) {
        // Create an ArrayList of String
        List<String> nameList = new ArrayList<String>();

        // Add some names
        nameList.add("A");
        nameList.add("B");
        nameList.add("C");

        // Get the count of names in the list
        int count = nameList.size();

        // Let us print the name list
        System.out.println("List of names...");
        for (int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);//
        }

        // Let us remove Kathleen from the list
        nameList.remove("Tasmia");

        // Get the count of names in the list again
        count = nameList.size();

        // Let us print the name list again
        for (int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }
    }
}
