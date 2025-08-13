package com.jay;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class Steps {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    private int helper(int num, int i) {
        if(num == 0){
            return i;
        }
        if (num%2==0){
            return helper(num/2, i+1);
        }
            return helper(num-1, i+1);
    }

}
