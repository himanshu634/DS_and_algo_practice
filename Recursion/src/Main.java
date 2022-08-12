// Lecture_Video : https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
// Assignment : https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/10-recursion.md

import com.LectureExample.Dice;
import com.backtracking.Maze;
import com.backtracking.NKnights;
import com.backtracking.NQueens;
import com.backtracking.SudokuSolver;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        SudokuSolver ss = new SudokuSolver();
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        ss.solve(board);

        if(ss.solve(board)){
            ss.display(board);
        }else {
            System.out.println("cannot solve");
        }

//        NQueens nq = new NQueens();
//        boolean[][] board = new boolean[4][4];
//
////        System.out.println(nq.placeQueens(board, 0));
//        NKnights kn = new NKnights();
//        kn.setKnights(board, 0, 0, 4);

//        HashMap<Integer, Integer> hm = new HashMap<>();

//        try {
//            int y = 10/0;
//            System.out.println(y);
//        }catch(ArithmeticException aex){
//            System.out.println("arithmetic exceptin");
//        }catch(Exception ex){
//            System.out.println("exception");
//        } finally {
//            System.out.println("finally");
//        }
//        MergeSort sc = new MergeSort();
//        int[] arr = {9,3, 4, 5, 6};
//        int[] ans = sc.mergeSort(arr);
//        for(int i : ans){
//            System.out.println(i);
//        }

//        Stream st = new Stream();
//        System.out.println(st.skipApple("bbbapplebbba"));

//        Subseq sb = new Subseq();
//        System.out.println(sb.printSubseq2("", "abc"));

//        Permutations permutations = new Permutations();
//        System.out.println(permutations.calculatePermutationList("", "abcdefghij"));

//        PhonePad phonePad = new PhonePad();
//        System.out.println(phonePad.findPermutationDigitCount("", "12"));

//        Dice dice = new Dice();
//        System.out.println(dice.findCombinationArrayList("",4));

//        Maze maze = new Maze();
//        System.out.println(maze.countPaths(3, 3));
////        maze.printPaths2("",3, 3);
//        boolean[][] board = {{true, true, true},
//                {true, true, true},
//                {true, true, true}};
//
//        int[][] path = new int[board.length][board[0].length];
//
//        maze.allPathPrint("", board,0, 0, path, 1);

//        triangle(new int[]{1, 6, 8});
    }

//    public void printAllNonMatching(String testString){
//        String ans = "";
//        for(int i = 0; i < testString.length(); i++){
//            String ch = String.valueOf(testString.charAt(i));
//
//            if((testString.substring(0, i)).contains(ch) || (testString.substring(i + 1).contains(ch))){
//                continue;
//            }
//
//            ans += ch;
//        }
//
//        System.out.println(ans);
//
//
//    }

//    public void canFormTriangle(int[] arr){
//        if((arr[0] + arr[1] < arr[2]) || (arr[1] + arr[2] < arr[0]) || (arr[0] + arr[2] < arr[1])){
//            System.out.println("NO");
//        }else{
//            System.out.println("YES");
//        }
//
//    }


}

