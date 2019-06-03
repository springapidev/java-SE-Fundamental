/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arraylist.ex6.replaceelement;

import java.util.ArrayList;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        arrayList.set(1, "REPLACED ELEMENT");

        System.out.println("ArrayList contains...");

        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println(arrayList.get(index));
        }

    }
}
