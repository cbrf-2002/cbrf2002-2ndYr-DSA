package cbrf2002.activity_cpdsaa2l;

import java.util.Arrays;

/*
 *
 * @author cbrf2002 | Charles Bryan Retaga Fabian
 * CPE211
 * 
 */

public class test {
    public static void main(String[] args) {
        int[] aasa = {2,1,4,8,9,5,67,43,8,9,0};
        Arrays.parallelSort(aasa);
        
        System.out.println("Parr sort: ");
        for (int val : aasa) {
            System.out.print(val + ", "); 
        }
    }
}