package com.jay.FacePrep;
import java.util.*;
public class Pi {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double amt = 3.14*r*r*h;
        System.out.println((int)Math.round(amt));
    }
}
