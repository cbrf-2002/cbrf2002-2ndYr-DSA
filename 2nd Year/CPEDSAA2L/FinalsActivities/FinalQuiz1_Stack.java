package FinalsActivities;
import java.util.Stack;

/**
 *
 * cbrf2002 | Charles Bryan R. Fabian
 * Quiz1 - CPE211
 * 
 */


public class FinalQuiz1_Stack {
    static Stack<String> stackElement = new Stack<>();
    
    public static void main(String[] args) {
        String pusher = "Copper";
        
        System.out.println("Initial Stack: " + stackElement + "\n\tisEmpty? " + stackElement.isEmpty());
        stackElement.push("Cobalt");
        stackElement.push("Adamantite");
        stackElement.push("Zircon");
        System.out.println("Original Stack: " + stackElement);
        System.out.println("\tPush: " + stackElement.push(pusher) + "\nNew Stack: " + stackElement);
        System.out.println("\tPop: " + stackElement.pop() + "\nNew Stack: " + stackElement);
        System.out.println("\tPeek: " + stackElement.peek() + "\nNew Stack: " + stackElement);
        System.out.println("\tisEmpty? " + stackElement.isEmpty());
    }
}
