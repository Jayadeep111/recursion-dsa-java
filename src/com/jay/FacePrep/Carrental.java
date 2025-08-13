package com.jay.FacePrep;
import java.util.*;
public class Carrental {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int r1 = sc.nextInt();
            int n = sc.nextInt();
            int r2 = sc.nextInt();
            int xy = sc.nextInt();
            int totalhr = xy / 60;

      if(xy %60!=0)

            {
                totalhr++;
            }

            int totalcost;
      if(xy<=n)

            {
                totalcost = totalhr * r1;
            }
      else

            {
                totalcost = (n * r1) + (totalhr - n) * r2;
            }
      System.out.println(totalcost);
        }
    }


