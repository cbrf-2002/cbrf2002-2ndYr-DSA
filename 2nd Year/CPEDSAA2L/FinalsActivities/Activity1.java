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
        System.out.println("SIZE: " + color.size());
        System.out.println("GET: " + color.get(1));
        System.out.println("PEEK: " + color.peek());
        System.out.println("ORIG: " + color);
        System.out.println("SET: " + color.set(0, 'O'));
        
        char abc = color.pop();
        color.push('A');
        
        System.out.println("REMOVE: " + abc);
        System.out.println("NEWLIST: " + color);
        System.out.println("EMPTY: " + color.empty());
        System.out.println("SEARCH: " + color.search('O'));
        System.out.println("CONTAINS: " + color.contains('T'));
    }
}
