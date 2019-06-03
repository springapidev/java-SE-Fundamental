/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.array.getMax;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] argv) throws Exception {
        double[] array = {34.45, 35.45, 36.67, 37.78,
            37.0000, 37.1234, 67.2344, 68.34534, 69.87700};
        System.out.println(getMax(array));
    }

    public static double getMax(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
