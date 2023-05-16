package FinalsActivities;

/**
 *
 * cbrf2002 - Fabian, Charles Bryan R.
 * CPE211
 * 
 */

import java.util.Stack;


public class Activity1 {

    public static void main(String[] args) {
        Stack <Character> color = new Stack<>();
        
        color.add('L');
        color.add('R');
        color.add('T');
        
        System.out.println("CONTAINS: " + color.contains('R'));
        System.out.println("PEEK: " + color.peek());
        System.out.println("ORIG: " + color);
        
        char abc = color.pop();
        
        System.out.println("REMOVE: " + abc);
        System.out.println("NEWLIST: " + color);
    }
}
