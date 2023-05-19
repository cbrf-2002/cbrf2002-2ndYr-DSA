package FinalsActivities;               //  Fabian - Charles Bryan R.
import java.util.Arrays;                //  CPE - 211 | CPDSAA2L
import java.util.Scanner;               //  Final Activity 1 - STACK
import java.util.Stack;
public class FinalActivity1_Stack {
    static Stack<Integer> stackElementOriginal = new Stack<>();
    static Stack<Integer> stackElement = new Stack<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        stackElementOriginal.addAll(Arrays.asList(3, 14, 15, 92, 65, 35));
        stackElement.addAll(stackElementOriginal);
        char conter;
        do {
            mainMenu();
            System.out.print("\nDo you want to continue? (y to continue, press any other keys to end): ");
            conter = scanner.next().charAt(0);
        } while (conter == 'y' || conter == 'Y');
        System.out.println("\nDone! Thank you for using!");
        scanner.close();
    }
    public static boolean mainMenu() {
        System.out.print("\nChoose any number (1-4) from the following operations:");
        System.out.print("\n\t1. Display the Original Elements of the Stack");
        System.out.print("\n\t2. Insert an element");
        System.out.print("\n\t3. Pop an element");
        System.out.print("\n\t4. Peek of the stack");
        System.out.print("\nEnter here: ");
        int choice = scanner.nextInt();
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
                System.out.println("Invalid input, please try again.\n");
                return false;
        }
    }
    public static void displaying() {
        if (!stackElement.isEmpty()) {
            System.out.println("\nOriginal Stack List: " + stackElementOriginal);
        } else {
            System.out.println("\nOriginal Stack List: Is empty...");
        }
    }
    public static void inserting() {
        System.out.print("\nEnter an integer to insert in stack: ");
        int insertion = scanner.nextInt();
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