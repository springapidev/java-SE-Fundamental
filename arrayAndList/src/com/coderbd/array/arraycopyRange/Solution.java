/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.array.arraycopyRange;

import java.util.Arrays;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] argv) throws Exception {
        String[] arr = new String[]{"1", "abc", "level", null,
            "tasmia.com", "asdf 123"};
        int startIndex = 2;
        int endIndex = 2;
        System.out.println(java.util.Arrays.toString(copyArrayRange(arr,
                startIndex, endIndex)));
    }

    public static String[] copyArrayRange(String[] arr, int startIndex,
            int endIndex) {
        String[] arrNew = Arrays.copyOfRange(arr, startIndex, endIndex);
        return arrNew;
    }
}
