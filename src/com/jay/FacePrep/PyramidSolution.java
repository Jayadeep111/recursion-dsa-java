package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class PyramidSolution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("__");
            }
            for(int j =1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}