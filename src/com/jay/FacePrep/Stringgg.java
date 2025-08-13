package com.jay.FacePrep;
import java .util.*;
public class Stringgg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 ="";
        int l1 = s1.length();
        int l2 = s2.length();
        for(int i=0; i<l2; i++){
            char a = s2.charAt(i);
            int count =0;
            for(int j =0; j<l1; j++){
                char b = s1.charAt(j);
                if(a == b){
                    count++;
                }
            }
            if(count==0){
                s3 = s3+a;
            }

        }
        System.out.println(s3);
    }

}
