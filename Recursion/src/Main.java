import com.LectureExample.BubbleUsingRecursion;
import com.LectureExample.SelectionRecursion;

import javax.swing.plaf.basic.BasicOptionPaneUI;

// Lecture_Video : https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
// Assignment : https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/10-recursion.md

public class Main {

    public static void main(String[] args){
     SelectionRecursion sc = new SelectionRecursion();
     int[] arr = {9,3, 4, 5, 6};
     int[] ans = sc.selection(arr, arr.length, 0, 0);
      for(int i : ans){
          System.out.println(i);
      }
    }
}
