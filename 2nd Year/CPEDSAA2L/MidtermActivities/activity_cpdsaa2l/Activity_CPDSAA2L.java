package cbrf2002.activity_cpdsaa2l;

/**
 *
 * @author cbrf2002 | Charles Bryan Retaga Fabian
 * CPE211
 * 
 */

import java.util.Scanner;
public class Activity_CPDSAA2L {

    public static void main(String[] args) {
        //Declare Array
        String usernames[] = {"cbrf2002", "argon_05", "drquack"};
        String passwords[] = {"totooba", "polonium999", "quackity42"};
        
        //Scanner input/declare
        Scanner u = new Scanner(System.in);
        
        //disp
        System.out.print("Enter Username: ");
        String un = u.nextLine();
        System.out.print("\nEnter Password: ");
        String pd = u.nextLine();
        
        //condition
        for (int i = 0; i<usernames.length; i++) {
            if (un.equals(usernames[i])) {
                if (pd.equals(passwords[i])) {
                    System.out.println("\nHello! " + usernames[i] + "!");
                    System.exit(0);
                }
            }
        }
        //denied
        System.out.println("ACCESS DENIED");
    }
}
