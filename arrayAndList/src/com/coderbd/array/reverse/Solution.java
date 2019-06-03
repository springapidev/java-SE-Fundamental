/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.array.reverse;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] argv) throws Exception {
        String[] array = new String[]{"1", "abc", "level", null,
            "tasmia.com", "asdf 123"};
        System.out.println(java.util.Arrays.toString(reverseArray(array)));
    }

    public static String[] reverseArray(String[] array) {
        String[] arrayReversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReversed[array.length - 1 - i] = array[i];
        }

        return arrayReversed;
    }

}
