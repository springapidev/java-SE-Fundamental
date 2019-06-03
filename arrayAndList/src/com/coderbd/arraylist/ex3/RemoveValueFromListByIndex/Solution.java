/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arraylist.ex3.RemoveValueFromListByIndex;

import java.util.ArrayList;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] args) {
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // append an item to the list          
        items.add(0, "yellow"); // insert "yellow" at index 0

        items.remove(1); // remove item at index 1
        display(items, "Remove second list element (green):");

    }

    // display the ArrayList's elements on the console
    public static void display(ArrayList<String> items, String header) {
        System.out.print(header); // display header

        // display each element in items
        for (String item : items) {
            System.out.printf(" %s", item);
        }

        System.out.println();
    }
}
