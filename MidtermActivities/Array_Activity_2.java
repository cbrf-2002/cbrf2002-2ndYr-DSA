package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ARRAY ACTIVITY #2
 * 
 */
import java.util.Scanner;

public class Array_Activity_2 {
    public static void main(String[] args) {
        //declare
        Scanner ap = new Scanner(System.in);
        boolean pop = false;
        int inp = 0;
        
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                        Array Elements by Charles");
        System.out.println("------------------------------------------------------------------------");
        
        //input
        do {
            System.out.print("\nHow many elements you want to enter (Maximum of 10): ");
            inp = ap.nextInt();
            if (inp > 0 && inp <= 10) {
                pop = true;
            } else {
                System.out.print("ERROR: Enter valid number...");
            }
        } while (pop == false);
        
        //declare2
        String[] arrelm = new String[inp+1];
        
        //input2
        System.out.print("\nEnter the elements of an Array:\n");
        for (int i = 0; i <= inp; i++) {
            arrelm[i] = ap.nextLine();
        }
        
        //output
        System.out.print("Array elements are: ");
        for (int o = 0; o <= inp; o++) {
            System.out.print(arrelm[o] + " ");
        }
    }
}
