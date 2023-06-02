package FinalsAcitivities;
import javafx.util.Pair;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Quiz3 {
    public static void main(String[] args) { 
       PriorityQueue<Pair<Character, String>> pq = 
               new PriorityQueue<> (Comparator.comparing(Pair::getKey));
       
       pq.add(new Pair<>('C', "Fabian"));
       pq.add(new Pair<>('J', "Sumalinog"));
       pq.add(new Pair<>('P', "Vicente"));
       pq.add(new Pair<>('V', "Nacpil"));
       pq.add(new Pair<>('A', "Bulatao"));
       
       System.out.println("QUEUE ELEMENT LIST: " + pq);
       System.out.println("QUEUE ELEMENT LIST SIZE: " + pq.size() + "\n");
              
       for (int i = 0; i < pq.size();i++) {
           int o = i + 1;
           System.out.println(o + ": " + pq.toArray()[i]);
       }
    }
}
