package Quiz;
import java.util.Scanner;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE211 - CPDSAA2L | ACTIVITY #4-B
 * 
 */

public class Quiz_1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your Grade: ");
        int num = scan.nextInt();
        {
        if (num>=75 && num<=100 )
            System.out.println("Passed");
        
        else if (num>=60 && num<=74 )
            System.out.println("FAILED");
        
        else if (num>=0  && num<=59 )
            System.out.println("INVALID GRADES");
        
        else 
            System.out.println("INVALID GRADES");
    
        }
        }
    }
