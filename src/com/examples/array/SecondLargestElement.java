package com.examples.array;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr1 = { 12, 35, 1, 10, 34, 1 };
        int[] arr2 = { 12, 12, 12, 12 };
        int[] arr = { 20769, 19913, 16575 };
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;

        if(arr.length <2){
            return secondMax;
        }

        for(int i = 0; i<arr.length; i++){

            if(max < arr[i]){
                secondMax = max;
                max = arr[i];
            }

            if(max > arr[i] &&  arr[i] > secondMax){
                secondMax = arr[i];
            }

            System.out.println(max);
            System.out.println(secondMax);
            System.out.println();
        }


        return secondMax;
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
