package com.HashMapAndHashFunction;

import java.util.*;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];

            // Check if remaining exists
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            // Store current element with index
            map.put(nums[i], i);
        }

        return new int[] {-1, -1}; // no solution
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}

