package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #4-B
 * 
 */

import java.util.Scanner;

public class Activity_4_2 {
    public static void main(String[] args) {
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                   10 Multiplication Table by Charles");
        System.out.println("------------------------------------------------------------------------");
        
        //scanner innit&decl
        Scanner count = new Scanner(System.in);
        System.out.print("What multiplication table do you want: ");
        int want = count.nextInt();
        
        //loop
        for (int i=1;i<=10;i++) {
            int wanted = i*want;
            System.out.printf("%-3d %-3s %-3d %-3s %-2d\n",i,"x",want," =",wanted);
        }
    }
}
