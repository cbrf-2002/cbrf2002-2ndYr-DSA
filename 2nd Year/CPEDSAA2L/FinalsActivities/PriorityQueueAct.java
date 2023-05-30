package FinalsActivity;
import java.util.PriorityQueue;
import javafx.util.Pair;

public class PriorityQueueAct {
    public static void main(String[] args) { 
       PriorityQueue<Pair<Integer, Integer>> nums = 
               new PriorityQueue<> ((number, numdin) -> number.getKey() - numdin.getKey());
       
       nums.add(new Pair<>(1, 3));
       nums.add(new Pair<>(4, 5));
       nums.add(new Pair<>(6, 7));
       nums.add(new Pair<>(8, 9));
       
       System.out.println("QUEUE ORIGINAL LIST: " + nums);
       System.out.println("QUEUE ELEMENT LIST SIZE: " + nums.size());
              
       for (int i = 0; i<nums.size();i++) {
           int o = i + 1;
           System.out.println(o + ": " + nums.toArray()[i]);
       }
    }
}
