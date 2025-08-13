package com.jay.FacePrep;
import java.util.*;
public class NextLeap {

        public static void main(String[] a){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while(!(n%4==0 && n%100!=0 || n%400==0)){
                n++;
            }
            int leap=n;
            System.out.println(n);
        }
    }

