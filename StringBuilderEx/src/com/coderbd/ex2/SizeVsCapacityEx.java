package com.coderbd.ex2;

public class SizeVsCapacityEx {

    /*
 Size is the number of characters currently in the StringBuilder, and capacity is the number of characters the StringBuilder can currently hold.

For StringBuilder, Java knows the size is likely to change as the object is used.
When StringBuilder is created, it may start at the default capacity of 16 characters or one of the programmer's choosing.
In the following example, we request a capacity of 5. At this point, the size is 0 since no characters have been added yet, but we have space for 5.
Next we add four characters. At this point, the size is 4 since four slots are taken. The capacity is still 5. Then we add three more characters. The size is now 7 since we have used up seven slots. Because the capacity wasn't large enough to store seven characters, Java automatically increased it for us. 
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        //    0      1       2      3      4 
        sb.append("java");
        //  0      1       2      3      4 
        sb.append("tasmia");
        // t     a       s      m      i      a   
        //0      1       2      3      4      5      6      7 ...........
    }

}
