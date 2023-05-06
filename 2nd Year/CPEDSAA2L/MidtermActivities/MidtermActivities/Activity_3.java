package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #3-A
 * 
 */

import java.util.Scanner;

public class Activity_3 {
    public static void main (String[] args) {
        //title        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                          Charles' number printer");
        System.out.println("------------------------------------------------------------------------");
        
        //scanner
        Scanner numin = new Scanner(System.in);
        
        //input
        System.out.print("\nInput the first number: ");
        int num1 = numin.nextInt();
        System.out.print("\nInput the second number: ");
        int num2 = numin.nextInt();
        
        //line
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        
        //printer
        System.out.println("Printing these two numbers, 10 times:");
        
        //while and var declaration
        int i = 0;
        while (i<10) {
           System.out.println(num1 + "              " + num2);
           i++;
        }
    }
}
