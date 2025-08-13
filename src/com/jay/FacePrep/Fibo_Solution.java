package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class Fibo_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.print(a);
        System.out.print(" "+b);
        for(int i =1; i<n; i++){
            int temp = b;
            b = b+a;
            System.out.print(" "+b);
            a=temp;
        }
        
    }
}