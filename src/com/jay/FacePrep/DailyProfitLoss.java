package com.jay.FacePrep;
import java.util.*;
public class DailyProfitLoss {


        public static void main(String[] a){
            Scanner sc = new Scanner(System.in);
            int invest = sc.nextInt();
            int earning = sc.nextInt();
            if((invest < 0 )|| (earning<0)){
                System.out.println("Invalid Input");
            }
            else if(earning > invest){
                int p = earning - invest;
                float pro_per= ((float)p/invest)*100;
                System.out.println("Profit - "+(int)pro_per+"%");

            }
            else if(earning < invest){
                int l = invest - earning;
                float loss_per= ((float)l/invest)*100;
                System.out.println("Loss - "+(int)loss_per+"%");
            }
        }
    }

