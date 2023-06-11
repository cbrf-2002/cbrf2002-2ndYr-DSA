import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length(); i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                int complementIndex = complementMap.get(complement);
                return new int[]{complementIndex, i};
            }

            complementMap.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum soln = new TwoSum();
        int[] sums = soln.twoSums(nums, target);

        System.out.println("Output: [" + sums[0] + ", " + sums[1] + "]");
    }
}
