package com.examples.array;

import java.util.HashMap;

public class RemoveDuplicates {

    public static void main(String [] args){
        int [] nums = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
        int [] numsArr = {1,1,1,2,2,3};
        int resultII = removeDuplicatesII(numsArr);
        System.out.println(resultII);

        HashMap<String, String> hm = new HashMap<>();
        hm.clear();

    }

    public static int removeDuplicates(int [] nums){
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j=1; j< nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        // Print the modified array (optional)
        ArrayUtility.printArray(nums);
        return i + 1;
    }

    public static int removeDuplicatesII(int [] nums){
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j=1; j< nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        // Print the modified array (optional)
        ArrayUtility.printArray(nums);
        return i + 1;
    }
}
