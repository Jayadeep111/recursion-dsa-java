package com.jay.stringsRecursionSubsets;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        //subseq("", "abc");
        System.out.println(subSeqList("", "abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //returning an arrayList of string

    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p+ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}

