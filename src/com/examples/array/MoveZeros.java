package com.examples.array;

public class MoveZeros {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr1[] = {3,5,0,0,4};
        moveZeroes(arr1);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

    static void pushZerosToEnd(int[] arr) {
        int counter = 0;
        for(int i= 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[counter];
            arr[counter] = temp;
            counter++;
        }
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Empty array");
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
              int temp = nums[i];
              nums[i] = nums[counter];
              nums[counter] = temp;
              counter++;
            }
        }
    }
}
