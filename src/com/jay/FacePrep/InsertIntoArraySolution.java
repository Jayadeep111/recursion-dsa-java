package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class InsertIntoArraySolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int pos = n;
        for(int j=0; j<arr.length; j++){
            if(m<arr[j]){
                pos = j;
                break;
            }
        }
        for(int j=n; j>pos; j--){
            arr[j] = arr[j-1];
        }
        arr[pos]=m;
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}