package com.examples.array;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}
