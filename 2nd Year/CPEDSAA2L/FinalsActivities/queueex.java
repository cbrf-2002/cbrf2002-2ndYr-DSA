package FinalsActivities;

import java.util.*;

public class queueex {
    static Queue<String> slol = new PriorityQueue<>();
    public static void offerer() {
        slol.offer("OnePlus");
        slol.offer("Apple");
        slol.offer("Cherry Mobile");
        slol.offer("Realme");
        slol.offer("Nokia");
        slol.offer("Blackberry");
    }
    public static void elementCounter() {
        System.out.println("Element List of Phones size : " + slol.size());
    }
    public static void lister() {
        System.out.println("\nQUEUE Element List of Names : ");
        Object[] p = slol.toArray();
        for (int i = 0; i < slol.size(); i++) {
            System.out.println("\t" + p[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("""
                           +-++-++-++-++-++-++-+ +-++-++-++-++-+
                           |c||h||a||r||l||e||s| |q||u||e||u||e|
                           +-++-++-++-++-++-++-+ +-++-++-++-++-+
                           """);
        offerer();
        elementCounter();
        lister();
    }
}
