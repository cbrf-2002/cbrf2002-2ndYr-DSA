package Quizzes;

/**
 *
 * @author cbrf2002 | Charles Bryan R. Fabian
 * CPE-211
 * 
 */

import java.util.Arrays;
import java.util.Collections;

public class Quiz_3 {

    public static void main(String[] args) {
        //array
        Integer[] arryeah = {8, 15, -5, 97, 13, 14, 67, 87, 110, 17, 90, 2, 83, 1002};
        String[] arrstr = {"Maple", "Grapes", "Rope", "Ladder", "Snake", "Berries", "National", "Puppy", "University", "Dasmarinas", "Talla", "Monitro", "Computadora", "Mouse"};
        //disp1st
        System.out.print("Integer Array []: ");
        for (int a : arryeah) {
            System.out.print(a + " ");
        }
        System.out.print("\nString Array []: " + Arrays.toString(arrstr));
        //subarray
        Arrays.parallelSort(arryeah, 2, 9);
        System.out.print("\n\nSubarray Integer Ascending: " + Arrays.toString(arryeah));
        Arrays.parallelSort(arrstr, 1,6);
        System.out.print("\nSubarray Integer Ascending: " + Arrays.toString(arrstr));
        //Positions and MINMAX
        int maxint = Collections.max(Arrays.asList(arryeah));
        int index = 0;
        for (int i = 0; i < arryeah.length; i++) { 
            if (arryeah[i].equals(Collections.max(Arrays.asList(arryeah)))) {
                System.out.print("\n\n Index Position of MAXIMUM element in given two arrays    : " + i);
                index = i;
                break;
            }
        }
        System.out.print("\n Largest Integer element in given array                   : " + maxint);
        System.out.print("\n Opposite String element in given array                   : " + arrstr[index]); 
    }
}
