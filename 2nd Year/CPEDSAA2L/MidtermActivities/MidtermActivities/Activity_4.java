package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #4-A
 * 
 */

import java.util.Scanner;

public class Activity_4 {
    public static void main (String[] args) {
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                         Factorial by Charles");
        System.out.println("------------------------------------------------------------------------");
        
        //scanner & input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int fac = 1;
        for (int i = 1; i<=n; i++) {
            fac *= i;
        }
        System.out.println("The factorial of "+n+" is equal to: " + fac);
    }
}
