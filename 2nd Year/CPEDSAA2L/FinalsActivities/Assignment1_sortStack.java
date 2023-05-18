package FinalsActivities;           //  Fabian - Charles Bryan R.
import java.util.*;                 //  CPE - 211 | CPDSAA2L -- Assignment 1 - STACK     
public class Assignment1_sortStack {
    public static void main (String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.addAll(Arrays.asList(12, 31, 54, 7, 22, 74, 45, 64, 23, 11, 9));
        System.out.println("\n\n\n\n\n\n\nUnsorted Stack: " + nums);
        Stack<Integer> sortedNums = sortedNums(nums);
        System.out.println("Sorted Stack: " + sortedNums);
    }
    public static Stack<Integer> sortedNums(Stack<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }
}