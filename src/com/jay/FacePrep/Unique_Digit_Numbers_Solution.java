package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class Unique_Digit_Numbers_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seen = new boolean[10];
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int count = 0;
        for(int i=n1; i<=n2; i++){
            if(isUnique(i)){
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean isUnique(int num){
        boolean[] seen = new boolean[10];
        while(num>0){
            int dig = num%10;
            if(seen[dig]==true){
                return false;
            }
            seen[dig] = true;
            num/=10;
        }
        return true;
    }
}