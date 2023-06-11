package FinalsActivities;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;

public class FinalActivity_4_LinkedList {
    public static Scanner scanner = new Scanner(System.in);

    public static void art() {
        System.out.println("""
            ░█▀▀░█▀▄░█▀▄░█▀▀░▀▀▄░▄▀▄░▄▀▄░▀▀▄          
            ░█░░░█▀▄░█▀▄░█▀▀░▄▀░░█/█░█/█░▄▀░          
            ░▀▀▀░▀▀░░▀░▀░▀░░░▀▀▀░░▀░░░▀░░▀▀▀          
            ░█░░░▀█▀░█▀█░█░█░█▀▀░█▀▄░░░█░░░▀█▀░█▀▀░▀█▀
            ░█░░░░█░░█░█░█▀▄░█▀▀░█░█░░░█░░░░█░░▀▀█░░█░
            ░▀▀▀░▀▀▀░▀░▀░▀░▀░▀▀▀░▀▀░░░░▀▀▀░▀▀▀░▀▀▀░░▀░
        """);
    }
    public static void main(String[] args) {
        art();

        LinkedList<String> list = new LinkedList<>();
        Collection<String> listadd = Arrays.asList("Weezer", "Radiohead", "nelward", "Wallows", "Yot Club", "Zild", "Radiohead");
        list.addAll(listadd);

        System.out.printf("Your Original List: %s%n", list);
        System.out.print("\nFind something you want in the list: ");
        String stringFind = scanner.nextLine();
        System.out.printf("contains() = %s%n", list.contains(stringFind));
        System.out.printf("indexOf() = %s%n", list.indexOf(stringFind));
        System.out.printf("lastIndexOf() = %s%n", list.lastIndexOf(stringFind));

        scanner.close();
    }
}