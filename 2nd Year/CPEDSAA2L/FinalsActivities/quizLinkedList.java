package FinalsActivities;
import java.util.*;

public class quizLinkedList {
    public static Scanner scanner = new Scanner(System.in);
    public static LinkedList inter = new LinkedList();
    public static char choice;
    
    public static void main(String[] args) {
        Collection interadd = Arrays.asList('N', 'I', 'C', 'E', "PERSON", "LOL", "NOT");
        inter.addAll(interadd);
    
        System.out.printf("Linked List : %s%n", inter);
        choice = 'y';
        do {
            System.out.print("""
                             
                               Choose any number (1-4) from the following operations:
                                    1. Insert two of the Element
                                    2. Remove one of the Element
                                    3. Display one of the Element
                                    4. Change one of the Element
                               Enter here:  """);
            int nums = scanner.nextInt();
            switch (nums) {
                case 1 -> Insert();
                case 2 -> Remove();
                case 3 -> Display();
                case 4 -> Change();
                default -> System.out.println("ERROR...");
            }
        } while (choice == 'y' | choice == 'Y');
        System.out.println("Thank you!");
    }
    public static void Insert() {
            inter.add(2, "GG");
            inter.add(5, 'S');
            System.out.printf("Inset two element into Linked List at Index 2 & 5: %s%nWant to do it again? (y or n): ", inter);
            choice = scanner.next().charAt(0);
        }
    public static void Remove() {
        System.out.print("Remove \"" + inter.get(4) + "\" into Linked List: ");
        inter.remove(4);
        System.out.println(inter);
        System.out.print("Want to do it again? (y or n): ");
        choice = scanner.next().charAt(0);
    }
    public static void Display() {
        System.out.printf("Linked List : %s%n", inter);
        Iterator disp = inter.iterator();
        while (disp.hasNext()) {
        if ("LOL".equals(disp.next())) {
            System.out.println("\"LOL\" is on the List");
        }
        }
        System.out.print("Want to do it again? (y or n): ");
        choice = scanner.next().charAt(0);
    }
    public static void Change() {
        System.out.print("Change \"BRUH\" from \"" + inter.get(2) + "\" into Linked List: ");
        inter.set(2, "BRUH");
        System.out.println(inter);
        System.out.print("Want to do it again? (y or n): ");
        choice = scanner.next().charAt(0);
    }
}
