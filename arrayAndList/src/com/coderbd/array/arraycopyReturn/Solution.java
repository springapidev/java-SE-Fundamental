/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.array.arraycopyReturn;

/**
 *
 * @author rajaul
 */
public class Solution {

    public static void main(String[] argv) throws Exception {
        int[] array = new int[]{34, 35, 36, 37, 37, 37, 67, 68, 69};
        System.out.println(java.util.Arrays.toString(copy(array)));
    }

    /**
     * Returns a copy of the array.
     */
    //a call to array.clone() may also work although this is a primitive type. I haven't checked
    //it even may be faster
    public static int[] copy(int[] array) {
        int[] result;
        result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    /**
     * Returns a copy of the array.
     */
    //a call to array.clone() may also work although this is a primitive type. I haven't checked
    //it even may be faster
    public static long[] copy(long[] array) {
        long[] result;
        result = new long[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    /**
     * Returns a copy of the array.
     */
    //a call to array.clone() may also work although this is a primitive type. I haven't checked
    //it even may be faster
    public static float[] copy(float[] array) {
        float[] result;
        result = new float[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    /**
     * Returns a copy of the array.
     */
    //a call to array.clone() may also work although this is a primitive type. I haven't checked
    //it even may be faster
    public static double[] copy(double[] array) {
        double[] result;
        result = new double[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    /**
     * Returns a copy of the array.
     */
    public static double[][] copy(double[][] v) {
        double[][] ans = new double[v.length][];
        for (int k = 0; k < v.length; k++) {
            ans[k] = copy(v[k]);
        }
        return (ans);
    }

    /**
     * Returns a copy of the array.
     */
    public static int[][] copy(int[][] v) {
        int[][] ans = new int[v.length][];
        for (int k = 0; k < v.length; k++) {
            ans[k] = copy(v[k]);
        }
        return (ans);
    }

    /**
     * Returns a comma delimited string representing the value of the array.
     */
    public static String toString(double[] array) {

        StringBuffer buf = new StringBuffer(array.length);
        int i;
        for (i = 0; i < array.length - 1; i++) {
            buf.append(array[i]);
            buf.append(',');
        }
        buf.append(array[i]);
        return buf.toString();
    }

    /**
     * Returns a comma delimited string representing the value of the array.
     */
    public static String toString(double[][] array) {
        StringBuffer buf = new StringBuffer();
        for (int k = 0; k < array.length; k++) {
            buf.append(toString(array[k]));
            buf.append(System.getProperty("line.separator"));
        }
        return buf.toString();
    }

    /**
     * Returns a comma delimited string representing the value of the array.
     */
    public static String toString(int[] array) {
        StringBuffer buf = new StringBuffer(array.length);
        int i;
        for (i = 0; i < array.length - 1; i++) {
            buf.append(array[i]);
            buf.append(',');
        }
        buf.append(array[i]);
        return buf.toString();
    }

    /**
     * Returns a comma delimited string representing the value of the array.
     */
    public static String toString(int[][] array) {
        StringBuffer buf = new StringBuffer();
        for (int k = 0; k < array.length; k++) {
            buf.append(toString(array[k]));
            buf.append(System.getProperty("line.separator"));
        }
        return buf.toString();
    }
}
