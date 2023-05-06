package activity_cpdsaa2l;


/**
 *
 * @author cbrf2002 | Charles Bryan Retaga Fabian
 * CPE211
 * 
 */

import java.util.Arrays;
import java.util.Collections;

public class Activity_Array_1 {
    public static void main(String[] args) {
        String[] hello = {"Hi", "How", "Are", "You", "String", "Example"};
        //orig
        System.out.print("\nString Array [] : ");
        for (String a : hello) {
            System.out.print(a + " ");
        }
        //ascending
        Arrays.parallelSort(hello);
        System.out.print("\n\nParallel Array Sort (ASCENDING) : " + Arrays.toString(hello));
        //descending
        Arrays.parallelSort(hello, Collections.reverseOrder());
        System.out.print("\nParallel Array Sort (DESCENDING) : " + Arrays.toString(hello));
    }
}
