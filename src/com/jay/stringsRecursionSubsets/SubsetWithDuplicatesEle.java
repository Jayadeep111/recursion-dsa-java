package com.jay.stringsRecursionSubsets;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicatesEle {
    public static void main(String[] args) {
        int[] arr= {1,2,2};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0; i<arr.length; i++){
            if (i > 0 && arr[i] == arr[i-1]) {
                s=e+1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for(int j =s; j<n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }
}
