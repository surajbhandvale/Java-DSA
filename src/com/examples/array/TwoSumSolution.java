package com.examples.array;

import java.util.HashMap;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff)){
               return new int [] {hm.get(diff), i}; 
            }
            hm.put(nums[i], i);
        }
        return new int[] {}; //return empty if no solution found
    }
}

    //Time Complexity: O(n)
    //Space Complexity: O(n)

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]
*/

/*
Explanation
        Use a HashMap to store numbers and their indices.
        For each number, check if target - num exists in the HashMap.
        If found, return the indices.
*/

   /* Other approach but less performance
   public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // No solution found
    }

    Time Complexity: O(n²)
    Space Complexity: O(1)
*/

