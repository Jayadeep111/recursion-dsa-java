package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class SeriesSolution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product=1;
        for(int i=1; i<=n; i++){
            System.out.print(i*i);
            if(i!=n){
                System.out.print(" ");
            }
        }
    }
}