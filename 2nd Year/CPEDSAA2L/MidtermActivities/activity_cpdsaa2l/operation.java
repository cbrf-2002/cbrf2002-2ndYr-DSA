package activity_cpdsaa2l;
/*
 *
 * @author cbrf2002 | Charles Bryan Retaga Fabian
 * CPE211
 * 
 */
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        //declare
        String opo[] = {"", "sum", "difference", "product", "quotient"};
        Scanner op = new Scanner(System.in);
        double f = 0;
        //choose
        System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n\nEnter the operation: ");
        int in = op.nextInt();
        System.out.print("Enter number 1: ");
        double n1 = op.nextInt();
        System.out.print("Enter number 2: ");
        double n2 = op.nextInt();
        //conditionals
        switch (in) {
            case 1 -> f = n1 + n2;
            case 2 -> f = n1 - n2;
            case 3 -> f = n1 * n2;
            case 4 -> f = n1 / n2;
        }
        switch (in) {
            case 1 -> System.out.println("The " + opo[in] + " of " + n1 + " and " + n2 + " is " + f);
            case 2 -> System.out.println("The " + opo[in] + " of " + n1 + " and " + n2 + " is " + f);
            case 3 -> System.out.println("The " + opo[in] + " of " + n1 + " and " + n2 + " is " + f);
            case 4 -> System.out.println("The " + opo[in] + " of " + n1 + " and " + n2 + " is " + f);
            default -> System.out.println("Invalid Input");
        }
    }
}
