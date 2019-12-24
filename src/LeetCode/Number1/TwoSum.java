package LeetCode.Number1;

import java.util.HashMap;
import java.util.Map;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
// 并返回他们的数组下标。
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int[] b = twoSum(a,9);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    private static int[] twoSum(int[] a,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int r = target - a[i];
            if (map.containsKey(r)){
                return new int[]{map.get(r),i};
            }
            map.put(a[i],i);
        }
        return null;
    }
}
