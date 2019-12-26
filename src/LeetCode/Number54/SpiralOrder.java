package LeetCode.Number54;

import java.util.ArrayList;
import java.util.List;

//给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                   {12,13,14,5},
                   {11,16,15,6},
                   {10,9,8,7}};
        List<Integer> list = spiralOrder(a);
        for (Integer b:
             list) {
            System.out.println(b);
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;
        int count = (Math.min(m,n)+1)/2;    //代表圈数
        int i = 0;
        while (i < count){
            for (int l = i; l < m-i; l++) {     //每一圈往右遍历
                list.add(matrix[i][l]);
            }
            for (int d = i+1; d < n-i; d++) {      //每一圈往下遍历
                list.add(matrix[d][n-i-1]);
            }
            for (int r = (n-1)-(i+1); r >= i && (m-1-i)!=i; r--) {     //每一圈往左遍历,如果这一层只有1行，那么第一个循环已经将该行打印了，这里就不需要打印了
                list.add(matrix[m-1-i][r]);
            }
            for (int u = (m-1)-(i+1); u >= i+1 && (n-1-i)!=i; u--) {        //每一圈往上遍历,如果这一层只有1行，那么第一个循环已经将该行打印了，这里就不需要打印了
                list.add(matrix[u][i]);
            }
            ++i;
        }
        return list;
    }
}
