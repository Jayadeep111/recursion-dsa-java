package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
         sum=sum+1+n;
        System.out.println(sum);
        
    }
}