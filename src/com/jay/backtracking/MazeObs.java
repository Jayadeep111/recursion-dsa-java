package com.jay.backtracking;

public class MazeObs {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObs("", arr, 0,0);
    }
    static void pathObs(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathObs(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathObs(p+'R', maze, r, c+1);
        }
    }
}
