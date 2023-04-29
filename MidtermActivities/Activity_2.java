package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #2
 * 
 */

import java.util.Scanner;

public class Activity_2 {
    public static void main(String[] args) {
        //clear
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
        
        //title        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("         Welcome to Charles' Estate! Choose your housing setup.");
        System.out.println("------------------------------------------------------------------------");
        
        //init Scanner
        Scanner numchoice = new Scanner(System.in);
        Scanner charchoice = new Scanner(System.in);
        
        //declare vars for switch case
        String finhouse = null;
        String fingrg = null;
        
        //first input choice
        System.out.println("\nEnter the type of house you want to purchase");
        System.out.print("    1 - Single Family\n    2 - Townhouse\n    3 - Condominium\nInput your choice: ");
        boolean housebool = false;
        
        do {
            int housetype = numchoice.nextInt();

            //first case
            switch (housetype) {
                case 1:
                    finhouse = "Single Family";
                    housebool = true;
                    break;
                case 2:
                    finhouse = "Townhouse";
                    housebool = true;
                    break;
                case 3:
                    finhouse = "Condominium";
                    housebool = true;
                    break;
                default:
                    System.out.print("\nInvalid input, try again.\nInput your choice: ");
                    break;
            }
        } while (!housebool);
        
        //second input choice
        System.out.println("\nEnter the type of house you want to purchase");
        System.out.print("    A - Doesn't Matter\n    B - Interior\n    C - Exterior\nInput your choice: ");
        boolean grgbool = false;
        
        do {
            char garagetype = charchoice.next().charAt(0);

            //second case
            switch (garagetype) {
                case 'A': case 'a':
                    fingrg = "Doesn't Matter";
                    grgbool = true;
                    break;
                case 'B': case 'b':
                    fingrg = "Interior";
                    grgbool = true;
                    break;
                case 'C': case 'c':
                    fingrg = "Exterior";
                    grgbool = true;
                    break;
                default:
                    System.out.print("\nInvalid input, try again.\nInput your choice: ");
                    break;
            }
        } while (!grgbool);
        
        //output
        System.out.println("\nThank you, your chosen type of house is: " + finhouse + "\nand your chosen garage type is: " + fingrg);
    }
}
