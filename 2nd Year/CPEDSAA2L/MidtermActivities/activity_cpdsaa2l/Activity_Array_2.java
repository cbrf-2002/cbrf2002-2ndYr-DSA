package cbrf2002.activity_cpdsaa2l;
/**
 *
 * @author cbrf2002 | Charles Bryan Retaga Fabian
 * CPE211
 * 
 */

import java.util.Arrays;
import java.util.Collections;

public class Activity_Array_2 {
    public static void main (String[] args) {
        String[] hello = {"Hi", "How", "Are", "You", "String", "Example", "Rolan", "Vernet", "Kiel", "Junelle"};
        //orig
        System.out.print("\nString Array[] : ");
        for (String a : hello) {
            System.out.print(a + " ");
        }
        //ascending
        Arrays.parallelSort(hello, 1, 8);
        System.out.println("\n\nParallel Array Sort (ASCENDING 1 - 8) : " + Arrays.toString(hello));
        
        //descending
        Arrays.parallelSort(hello, 1, 8, Collections.reverseOrder());
        System.out.println("Parallel Array Sort (DESCENDING 1 - 8) : " + Arrays.toString(hello));
    }
}
