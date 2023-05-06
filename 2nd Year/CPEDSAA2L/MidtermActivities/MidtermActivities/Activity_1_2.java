package MidtermActivities;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211
 * 
 */

/*
2. Comparing of Two Value using Nested if-then-else
        Use Operator for True / False
        Use Scanner to enter the value
        Follow the given example output below
        Give more Screenshot for Output

*/
import java.util.Scanner;

public class Activity_1_2 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("         Comparing the Value 1 >= Value 2 by Charles Fabian");
        System.out.println("------------------------------------------------------------------------");
        
        //input
        Scanner nums = new Scanner(System.in);
        System.out.print("Enter value for Num 1: ");
        int num1 = nums.nextInt();
        System.out.print("Enter value for Num 2: ");
        int num2 = nums.nextInt();
               
        //if-else
        if (num1 > num2) {
            System.out.println("Value 1 is the highest and it is true");  
        } else if (num1 == num2) {
            System.out.println("Value 1 and Value 2 are equal");
        } else {
            System.out.println("Value 1 is not the highest and it is false");
        }
    }
}
