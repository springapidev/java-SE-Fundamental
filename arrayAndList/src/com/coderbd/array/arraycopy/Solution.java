/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.array.arraycopy;

import java.util.Arrays;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] argv) throws Exception {
        String[] arr = new String[]{"1", "abc", "level", null,
            "tasmia.com", "asdf 123"};
        System.out.println(java.util.Arrays.toString(copyArray(arr)));
    }

    public static String[] copyArray(String[] arr) {
        String[] arrNew = Arrays.copyOf(arr, arr.length);
        return arrNew;
    }
}
