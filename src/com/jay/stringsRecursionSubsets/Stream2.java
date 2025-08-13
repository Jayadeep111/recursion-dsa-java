package com.jay.stringsRecursionSubsets;

public class Stream2 {
    public static void main(String[] args) {
        System.out.println(skip("baccad"));
    }
    static String skip(String n){
        if(n.isEmpty()){
            return "";
        }
        char ch = n.charAt(0);
        if(ch == 'a'){
            return skip(n.substring(1));
        }
        else{
            return ch+skip(n.substring(1));
        }
    }
}
