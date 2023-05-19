package FinalsActivities;               //  Fabian - Charles Bryan R.
import java.util.Arrays;                //  CPE - 211 | CPDSAA2L
import java.util.Scanner;               //  Final Activity 1 - STACK
import java.util.Stack;
public class FinalActivity1_Stack {
    static Stack<Integer> stackElementOriginal = new Stack<>();
    static Stack<Integer> stackElement = new Stack<>();
    static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {
        //declare
        boolean booler = false;
        boolean booo = false;
        stackElementOriginal.addAll(Arrays.asList(3,14,15,92,65,35));
        stackElement.addAll(stackElementOriginal);
        char conter;
        //title
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                  Stack Implementation by Charles Fabian");
        System.out.println("------------------------------------------------------------------------");
        //loop
        do {
            do {
                booler = loopStatement(booler);
            } while (!booler);
            System.out.print("\nDo you want to continue? (y or n): ");
            conter = a.next().charAt(0);
            switch (conter) {
                case 'y':
                case 'Y':
                    break;
                case 'n':
                case 'N':
                    booo = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } while (!booo);
        //bye
        System.out.println("\nDone! Thank you for using!");
        a.close();
    }
    public static boolean loopStatement(boolean booler) {
        System.out.print("\nChoose any number (1-4) from the following operations:");
            System.out.print("\n\t1. Display the Original Elements of the Stack");
            System.out.print("\n\t2. Insert an element");
            System.out.print("\n\t3. Pop an element");
            System.out.print("\n\t4. Peek of the stack");
            System.out.print("\nEnter here: ");
            int choice = a.nextInt();
            //switch
            switch (choice) {
                case 1:
                    displaying();
                    return true;
                case 2:
                    inserting();
                    return true;
                case 3:
                    popping();
                    return true;
                case 4:
                    peeker();
                    return true;
                default:
                    System.out.println("Invalid input, please try again.\n\n\n\n\n");
                    return false;
            }
    }
    public static void displaying() {
        if (!stackElement.isEmpty()) {
            System.out.println("\nOriginal Stack List: " + stackElementOriginal);
        } else {
            System.out.println("\nOriginal Stack List: Is empty...);
        }
    }
    public static void inserting() {
        System.out.print("\nEnter an integer to insert in stack: ");
        int insertion = a.nextInt();
        stackElement.push(insertion);
        System.out.println("\nNEW stack list: " + stackElement);
    }
    public static void popping() {
        if (!stackElement.isEmpty()) {
            int poppedElement = stackElement.pop();
            System.out.print("\nElement popped out: " + poppedElement);
            System.out.println("\nNEW stack list: " + stackElement);
        } else {
            System.out.println("Stack is already empty. Cannot perform pop operation.");
        }
    }
    public static void peeker() {
        if (!stackElement.isEmpty()) {
            int peekedElement = stackElement.peek();
            System.out.println("\nTop most element in stack: " + peekedElement);
            System.out.println("NEW stack list: " + stackElement);
        } else {
            System.out.println("Stack is empty. Cannot perform peek operation.");
        }
    }
}