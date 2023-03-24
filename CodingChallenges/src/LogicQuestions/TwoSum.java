package LogicQuestions;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6 , 11, 15};
        int target = 9;
        int[] result = getTwoSum(nums, target);
        System.out.println("The indices of the two elements that sum up to " + target + " are: " + result[0] + " and " + result[1]);
    }

    public static int[] getTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}

