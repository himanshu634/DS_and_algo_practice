import com.Examples.easy.PlusOne;
import com.Examples.medium.SpiralMatrix;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/05-arrays.md

public class Main {

    public static void main(String[] args){
//        ReshapeArray rs = new ReshapeArray();
//        int[][] ans = rs.matrixReshape(new int[][]{{1, 2}, {3,4}, {5, 6}},2,3);
//
//        for(int[] arr: ans){
//            for(int element: arr){
//                System.out.print(element);
//            }
//            System.out.println();
//        }

        SpiralMatrix sm = new SpiralMatrix();
        System.out.println(sm.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6},{7, 8, 9}}).toString());


    }
}
