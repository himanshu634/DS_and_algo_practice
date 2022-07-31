package com.backtracking;

// reference: https://www.youtube.com/watch?v=zg5v2rlV1tM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=35&t=1366s

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    // here in this problem we cannot move backward because of stackoverflow problem as kunal mentioned
    // in time stamp 55:05
    public int countPaths(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        return countPaths(row - 1, col) + countPaths(row, col - 1);
    }

    public void printPaths(String path,int row, int col){
        if(row == 1){
            for(int i = col; i > 1; i--){
                path += "R";
            }
            System.out.print(path + " ");
            return;
        }
        if(col == 1){
            for(int i = row; i > 1; i--){
                path = path + "D";
            }
            System.out.print(path + " ");
            return;
        }
        printPaths(path + 'D',row - 1, col);
        printPaths( path + "R",row, col - 1);
    }

    public void printPaths2(String path,int row, int col){
        if(row == 1 && col == 1){
            System.out.print(path + " ");
            return;
        }
        if(row > 1) {
            printPaths2(path + 'D', row - 1, col);
        }
        if(col > 1){
            printPaths2( path + "R",row, col - 1);
        }
    }

    public ArrayList<String> printPathsArrayList(String path, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row > 1) {
            ans.addAll(printPathsArrayList(path + 'D', row - 1, col));
        }
        if(col > 1){
            ans.addAll(printPathsArrayList( path + "R",row, col - 1));
        }
        return ans;
    }

    public ArrayList<String> printPathsDiagonal(String path, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(row > 1 && col > 1){
            ans.addAll(printPathsDiagonal(path + "D", row - 1, col - 1));
        }
        if(row > 1) {
            ans.addAll(printPathsDiagonal(path + 'V', row - 1, col));
        }
        if(col > 1){
            ans.addAll(printPathsDiagonal( path + "H",row, col - 1));
        }
        return ans;
    }

    public ArrayList<String> printPathsRestrictions(String path, boolean[][] maze,int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(!maze[row][col]){
            return null;
        }

        if(row < maze.length - 1) {
            ArrayList<String> left = printPathsRestrictions(path + 'D', maze, row + 1, col);
            if(left != null){
                ans.addAll(left);
            }
        }
        if(col < maze[0].length - 1){
            ArrayList<String> right = printPathsRestrictions( path + "R", maze, row, col + 1);
            if(right != null){
                ans.addAll(right);
            }
        }
        return ans;
    }

    public void allPaths(String path, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // marking cell as visited
        maze[row][col] = false;

        if(row < maze.length - 1){
            allPaths(path + "D", maze, row + 1, col);
        }

        if(col < maze[0].length - 1){
            allPaths(path + "R", maze, row, col + 1);
        }

        if(row > 0){
            allPaths(path + "U", maze, row - 1, col);
        }

        if(col > 0){
            allPaths(path + "L", maze, row, col - 1);
        }

        //while coming backward from future calls mark this cell as visited
        maze[row][col] = true;
    }

    public void allPathPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // marking cell as visited
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1){
            allPathPrint(p + "D", maze, row + 1, col, path, step + 1);
        }

        if(col < maze[0].length - 1){
            allPathPrint(p + "R", maze, row, col + 1, path, step + 1);
        }

        if(row > 0){
            allPathPrint(p + "U", maze, row - 1, col, path, step + 1);
        }

        if(col > 0){
            allPathPrint(p + "L", maze, row, col - 1, path, step + 1);
        }

        //while coming backward from future calls mark this cell as visited
        maze[row][col] = true;
        path[row][col] = 0;

    }
}
