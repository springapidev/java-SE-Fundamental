package com.coderbd.ex1;

public class HowToCreateEx {

    /*
    The StringBuilder class creates a String without storing all those interim String values.
Unlike the String class, StringBuilder is not immutable.

Creating a StringBuilder
There are three ways to construct a StringBuilder: 
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();//   The first constructor creates a StringBuilder containing an empty sequence of characters and assign sb1 to point to it.
        StringBuilder sb2 = new StringBuilder("coderbd.com");//The second constructor creates a StringBuilder containing a specific value and assign sb2 to point to it.
        StringBuilder sb3 = new StringBuilder(10);//The third constructor reserves a certain number of slots for characters.      
    }
}
