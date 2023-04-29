package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #3-B
 * 
 */

import java.util.Scanner;

public class Activity_3_2 {
    public static void main (String[] args) {
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                  Grade input and average by Charles");
        System.out.println("------------------------------------------------------------------------");
        
        //scanner innit
        Scanner gradearr = new Scanner(System.in);
        Scanner grades = new Scanner(System.in);
        
        //array input
        System.out.print("How many number of grades you will enter: ");
        int arrgrade = gradearr.nextInt();
        
        //array innit
        int[] garr = new int[arrgrade];
        
        //dowhile
        int i = 0;
        do {
            System.out.print((i+1)+". Enter your grade: ");
            garr[i] = grades.nextInt();
            i++;
        } while (i < arrgrade);
        
        //average
        int sumarr = 0;
        for (int c = 0; c < arrgrade; c++) {
            sumarr += garr[c];
        }
        double avgrd = (double) sumarr / arrgrade;
        
        //Output
        System.out.println("\n------------------------------------------------------------------------");
        System.out.printf("Your average grade is: %.2f\n", avgrd);
        System.out.println("------------------------------------------------------------------------\n");
    }
}
