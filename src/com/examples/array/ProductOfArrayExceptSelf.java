package com.examples.array;

public class ProductOfArrayExceptSelf {

    public static void main(String [] args){
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int [] inputArr = {1,2,3,4,5};
        int [] result = obj.productExceptSelf(inputArr);
        for(int num: result){
            System.out.print(num+" ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prefix = 1;
        for(int i=0; i<n; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }

    /*public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=0; j<nums.length; j++){
                if( i != j){
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }*/
}
