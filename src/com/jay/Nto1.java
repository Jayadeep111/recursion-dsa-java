package com.jay;
// 5 to 1 but printing 1 to 5
public class Nto1 {
    public static void main(String[] args) {
       //funRev(5);
       funBoth(5);
    }
    static void funRev(int n){
        if(n==0){

            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
//printing 5 to 1 and then 1 to 5
    static void funBoth(int n){
       if(n==0){
        return;
       }
       System.out.println(n);
       funBoth(n-1);
       System.out.println(n);
}
}
