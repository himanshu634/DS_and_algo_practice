// Lecture_Video : https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
// Assignment : https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/10-recursion.md

import com.LectureExample.Dice;
import com.backtracking.Maze;

public class Main {

    public static void main(String[] args) {
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

        Maze maze = new Maze();
        System.out.println(maze.countPaths(3, 3));
//        maze.printPaths2("",3, 3);
        boolean[][] board = {{true, true, true},
                {true, true, true},
                {true, true, true}};

        int[][] path = new int[board.length][board[0].length];

        maze.allPathPrint("", board,0, 0, path, 1);
    }
}

