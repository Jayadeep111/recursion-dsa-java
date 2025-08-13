package com.jay.FacePrep;
import java.util.*;
public class Newspaper {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int tr=a*b;
        int tot_cost= (a*c)+100;
        int pro= tr-tot_cost;
        System.out.println(pro);
    }
}
