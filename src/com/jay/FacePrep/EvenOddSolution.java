package com.jay.FacePrep;

import java.io.*;
import java.util.*;

public class EvenOddSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        int b=2;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(b);
                    b=b+i;
                }
                else{
                    System.out.print(a);
                    a=a+i;
                }



            }
        }

    }
