package com.jay.backtracking;

import java.util.Arrays;

public class MazeAllDirectonUDLR {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
       // pathAllDir("", arr, 0,0);
        int[][] path = new int[arr.length][arr[0].length];
        pathAllDirPrint("", arr, 0,0, path, 1);
    }
    static void pathAllDir(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){

            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            pathAllDir(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathAllDir(p+'R', maze, r, c+1);
        }
        if(r>0){
            pathAllDir(p+'U', maze,r-1, c);
        }
        if(c>0){
            pathAllDir(p+'L', maze,r, c-1);
        }
        maze[r][c] = true;
    }
//printing the possible steps in the matrix and also printing the path below the matrix
    static void pathAllDirPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]= step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c]= step;
        if(r<maze.length-1){
            pathAllDirPrint(p+'D', maze, r+1, c, path, step+1);
        }
        if(c<maze[0].length-1){
            pathAllDirPrint(p+'R', maze, r, c+1, path, step+1);
        }
        if(r>0){
            pathAllDirPrint(p+'U', maze,r-1, c, path, step+1);
        }
        if(c>0){
            pathAllDirPrint(p+'L', maze,r, c-1, path, step+1);
        }
        maze[r][c] = true;
        path[r][c]= 0;
    }
}
