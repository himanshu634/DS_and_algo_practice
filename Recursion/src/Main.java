import com.LectureExample.BubbleUsingRecursion;
import com.LectureExample.MergeSort;
import com.LectureExample.SelectionRecursion;
import com.LectureExample.SelectionSortRecursion;
import com.strings.Permutations;
import com.strings.Stream;
import com.strings.SubSet;
import com.strings.Subseq;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;

// Lecture_Video : https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
// Assignment : https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/10-recursion.md

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

        Permutations permutations = new Permutations();
        System.out.println(permutations.calculatePermutationList("", "abcdefghij"));
    }
}

