package com.jay.FacePrep;
import java.io.*;
import java.util.*;
public class Leap {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            int i = year;
            while(year>0){
                if((i%400==0) || (i%100!=0 && i%4==0)){
                    System.out.println(i);
                    break;
                }
                else{
                    i=i+1;
                }
            }
        }
    }

