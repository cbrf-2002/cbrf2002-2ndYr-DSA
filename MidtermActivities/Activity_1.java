package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211
 * 
 */

/*
    1.	Using if-then-else Conditional Flow Control with Scanner
	A vowel letters are A, E, I, O, U
	Give more Screenshot for Output

*/
import java.util.Scanner;


public class Activity_1 {

    public static void main(String[] args) {
        //clear
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                  Vowel determiner by Charles Fabian");
        System.out.println("------------------------------------------------------------------------");
        //scanner init
        Scanner letter = new Scanner(System.in);
        //enter something
        System.out.println("\nEnter a letter to determine if the letter is a vowel:");
        String input = letter.nextLine();
        //error-checking
        
        if (letter.hasNextLine()) {
            if (input.length() > 1) {
                System.out.println("WARNING: Input must only be a single character, selecting first character...\n");
                input = input.substring(0,1);
            }
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input: \"" + input + "\" is not a letter.");
            }
            else if (input.equals("a") || input.equals("A") || input.equals("e") || input.equals("E") || input.equals("i") || input.equals("I") || input.equals("o") || input.equals("O") || input.equals("u") || input.equals("U")) {
                //correct
                System.out.println("The letter \"" + input + "\" is a vowel.");
            } else {
                System.out.println("The letter \"" + input + "\" is not a vowel, but a consonant.");
            }
        }
    }
}
