package com.jay.backtracking;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(pathlistdiag("", 3, 3));
    }
    static void path(String p, int r, int c ){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R', r, c-1);
        }
    }
//return as array list
    static ArrayList<String> pathlist(String p, int r, int c ){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathlist(p+'D', r-1, c));
        }
        if(c>1){
            list.addAll(pathlist(p+'R', r, c-1));
        }
        return list;
    }
//path diag
    static ArrayList<String> pathlistdiag(String p, int r, int c ){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathlistdiag(p+'D', r-1, c-1));
        }
        if(r>1){
            list.addAll(pathlistdiag(p+'V', r-1, c));
        }
        if(c>1){
            list.addAll(pathlistdiag(p+'H', r, c-1));
        }
        return list;
    }
}
