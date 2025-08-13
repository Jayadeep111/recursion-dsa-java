package com.jay.FacePrep;
import java.io.*;
import java.util.*;
public class Digits_position {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int len = String.valueOf(n).length();
            int dig=1;
            if(k>len){
                System.out.println("-1");
            }
            else{
                for(int i=1; i<=k; i++){
                     dig=n%10;
                    n/=10;
                }
                int digitK=dig%10;
                System.out.println(digitK);
            }


        }
    }

