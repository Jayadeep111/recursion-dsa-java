package com.jay.FacePrep;
import java.util.*;
public class Area {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2*(l+b);
        int area = l*b;
        System.out.println("The required length is "+ perimeter+" m");
        System.out.println("The required length is "+ area+" sqm");
    }
}
