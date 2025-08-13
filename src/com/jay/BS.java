package com.jay;

public class BS {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,55,66,78};
int target =66;
        System.out.println(search(arr, 0, arr.length-1,  target));
    }
    static int search(int[] arr, int s, int e, int target){
         if (s>e){
             return -1;
         }
         int m = s+(e - s)/2;
         if(arr[m]==target){
             return m;
         }
         if(target<arr[m]){
            return search(arr, s, m-1, target );
        }
         return search(arr, m+1, e, target);
    }
}
