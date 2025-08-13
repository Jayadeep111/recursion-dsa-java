package com.jay.stringsRecursionSubsets;

import java.util.ArrayList;

public class PhonePadLeetcode {
    public static void main(String[] args) {
        phone("","23");
//        ArrayList<String> ans =  phoneList("", "12");
//        System.out.println(ans);
      //  System.out.println(phonecount("", "12"));

    }
    static void phone(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int dig = up.charAt(0)- '0'; //this will convert '2' into 2
        for(int i = (dig-2)*3; i<(dig-1)*3; i++){
            char ch = (char) ('a' + i);
            phone(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> phoneList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int dig = up.charAt(0)- '0'; //this will convert '2' into 2
        for(int i = (dig-1) * 3; i<dig*3; i++){
            char ch = (char) ('a' + i);
            ans.addAll(phoneList(p+ch, up.substring(1)));
        }
        return ans;
    }
    static int phonecount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int dig = up.charAt(0)-'0';
        int count =0;
        for(int i= (dig-1)*3; i<dig*3; i++){
            char ch = (char)('a'+i);
            count += phonecount(p+ch, up.substring(1));
        }
        return count;
    }
}

//METHOD 1
//import java.util.*;
//public Solution{
//    public List<String> letterCombinations(String digits) {
//        List<String> ans = new ArrayList<>();
//        if(digits.isEmpty()){
//            return ans;
//        }
//        phone("",digits,ans);
//        return ans;
//    }
//    private void phone(String p, String up, List<String> ans){
//        if(up.isEmpty()){
//            ans.add(p);
//            return;
//        }
//        int dig = digits.charAt(0)-'0';
//        int start = starts(dig);
//
//    }
//    private int getStartIndex(int dig) {
//        int base = (dig-2)*3;
//    }
//}

//METHOD 2

//import java.util.*;
//
//class Solution {
//    public List<String> letterCombinations(String digits) {
//        List<String> ans = new ArrayList<>();
//        if (digits.isEmpty()) return ans; // Edge case
//
//        phone("", digits, ans);
//        return ans;
//    }
//
//    private void phone(String p, String up, List<String> ans) {
//        if (up.isEmpty()) {
//            ans.add(p);
//            return;
//        }
//
//        int dig = up.charAt(0) - '0';
//        String[] mapping = {
//                "",     // 0
//                "",     // 1
//                "abc",  // 2
//                "def",  // 3
//                "ghi",  // 4
//                "jkl",  // 5
//                "mno",  // 6
//                "pqrs", // 7
//                "tuv",  // 8
//                "wxyz"  // 9
//        };
//
//        String letters = mapping[dig];
//        for (char ch : letters.toCharArray()) {
//            phone(p + ch, up.substring(1), ans);
//        }
//    }
//}
