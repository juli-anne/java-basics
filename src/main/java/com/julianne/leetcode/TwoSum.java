package com.julianne.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // empty map initially

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to reach target
            if (map.containsKey(complement)) {
                // found the pair
                return new int[]{map.get(complement), i};
            }
            // save current number and its index
            map.put(nums[i], i);
        }

        // since problem guarantees exactly one solution
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // output: [0, 1]
    }
}