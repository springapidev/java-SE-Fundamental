package com.coderbd.ex6;

public class DeleteAndDeleteCharAtEx {

    public static void main(String[] args) {
        /*
         delete() method is the opposite of the insert() method. delete() method removes characters from the StringBuilder and returns a reference to the current StringBuilder.
The deleteCharAt() method is convenient when you want to delete only one character.
The method signatures are as follows:
StringBuilder delete(int start, int end) 
StringBuilder deleteCharAt(int index) 
         */
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3);                  // sb = adef 
        sb.deleteCharAt(5);               // throws an exception since there is not letter in position 5. 
    }
}
