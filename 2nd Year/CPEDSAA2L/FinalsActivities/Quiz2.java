package FinalsAcitivities;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;

public class Quiz2 {
    static Queue<Character> quee = new PriorityQueue<>();
    static Scanner scanner = new Scanner(System.in);
    static Scanner charrs = new Scanner(System.in);
    public static void main(String[] args) {
        char continuee;
        do {
            mainMenu();
            System.out.print("\nDo you want to continue? (y to continue, press any other keys to end): ");
            continuee = scanner.next().charAt(0);
        } while (Character.toLowerCase(continuee) == 'y');
        System.out.println("\nDone! Thank you for using!");
        scanner.close();
    }
    public static void mainMenu() {
        System.out.print("\nChoose a number [1-4] for the following operations:\n" +
                "\t1. ENQUEUE\n" +
                "\t2. DEQUEUE\n" +
                "\t3. SIZE\n" +
                "\t4. isEMPTY?\n" +
                "Enter here: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                enq();
                break;
            case 2:
                deq();
                break;
            case 3:
                sizer();
                break;
            case 4:
                isEmpt();
                break;
            default:
                System.out.println("Invalid input, please try again.\n");
        }
    }
    public static void enq() {
        System.out.print("\nEnter a CHARACTER to insert in Queue List: ");
        char insertedElement = charrs.next().charAt(0);
        quee.add(insertedElement);
        System.out.println("\nNEW Queue list: " + quee);
    }
    public static void deq() {
        if (!quee.isEmpty()) {
            char dequeued = quee.poll();
            System.out.print("\nRemove Element from Queue list: " + dequeued);
            System.out.println("\nNEW Queue list: " + quee);
        } else {
            System.out.println("Queue is already empty. Cannot perform dequeue operation.");
        }
    }
    public static void sizer() {
        if (!quee.isEmpty()) {
            int sizeQ = quee.size();
            System.out.println("\nSize of Element in queue list is: " + sizeQ);
            System.out.println("NEW queue list: " + quee);
        } else {
            System.out.println("Queue is empty. Cannot perform size operation.");
        }
    }
        public static void isEmpt() {
            System.out.print("\nIs queue list element is empty???: " + quee.isEmpty());
            System.out.println("\nNEW Queue list: " + quee);
    }
}
