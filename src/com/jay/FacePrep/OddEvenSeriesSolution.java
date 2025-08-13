package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class OddEvenSeriesSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n);
        for(int i =n; i>=1; i++){
            if(n<=1){
                break;
            }
            if(n%2==0){
                n/=2;
                System.out.print(" "+n);
            }
            else{
                n=(n*3)+1;
                System.out.print(" "+n);
            }
        }
    }
}