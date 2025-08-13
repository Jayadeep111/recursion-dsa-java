package com.jay.FacePrep;

import java.sql.SQLOutput;
import java.util.*;
public class Timeconvert{
    public static void main(String[] a){
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int time = x*y;
        if(time > 12 && time <= 24){
            time=time-12;
            System.out.println(time);
        }
        else if(time>24){
            time=time-24;
            System.out.println(time);
        }
        else{
            System.out.println(time);
        }
    }
}