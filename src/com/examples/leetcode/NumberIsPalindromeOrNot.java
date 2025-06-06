package com.examples.leetcode;

public class NumberIsPalindromeOrNot {

    public static void main(String[] args) {
        new NumberIsPalindromeOrNot().isPalindrome(234);
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false ;
        }
        int n = x ;
        int revNum = 0 ;
        while(n>0){
            int d = n%10 ;
            System.out.println(d);
            revNum = revNum*10 + d ;
            System.out.println(revNum);
            n = n/10 ;
            System.out.println(n);
        }
        if(revNum == x ){
            return true ;
        }
        else{
            return false ;
        }
    }
}
