package com.examples.leetcode;

public class PowerOfTwo {

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n){
        if(n < 1){
            return false;
        }else if(n == 1){
            return true;
        }else{
            while(n % 2 ==0){
                n = n/2;
            }
            if(n == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}
