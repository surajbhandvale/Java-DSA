package com.examples.array;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String [] args){
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1,2,1,3};
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int number: nums){
            if(numbers.contains(number)){
                return true;
            }
            numbers.add(number);
        }
        return false;
    }
}
