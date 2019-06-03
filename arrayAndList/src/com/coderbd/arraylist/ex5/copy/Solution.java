/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arraylist.ex5.copy;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rajaul
 */
public class Solution {

    //Copy Elements of One ArrayList to Another ArrayList 
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");

        //create another ArrayList object
        ArrayList arrayList2 = new ArrayList();

        //Add elements to Arraylist
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        arrayList2.add("Four");
        arrayList2.add("Five");

        System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);

        Collections.copy(arrayList2, arrayList1);

        System.out.println("After copy, Second ArrayList Contains : " + arrayList2);
    }
}
