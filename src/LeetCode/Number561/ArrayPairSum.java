package LeetCode.Number561;

import java.util.Arrays;

//给定长度为 2n 的数组, 你的任务是将这些数分成 n 对
// 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
public class ArrayPairSum {
    public static void main(String[] args) {
        int[] a = {6,4,3,1,2,5};
        System.out.println(arrayPairSum(a));
    }
    private static int arrayPairSum(int[] sums){
        Arrays.sort(sums);
        int sum = 0;
        for (int i = 0; i < sums.length; i+=2) {
            sum = sum + sums[i];
        }
        return sum;
    }
}
