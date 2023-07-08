package com.problems.LeetCode.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
