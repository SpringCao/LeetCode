package LeetCode.Number15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个包含 n 个整数的数组 nums，
//判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
public class ThreeSum {
    public static void main(String[] args) {
        int[] a={-1,0,1,2,-1,-4,-1};
        System.out.print(threeSum(a));

    }
    private static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            if (k >0 && nums[k] == nums[k-1]) continue;
            int i = k+1,j=nums.length-1;
            while (i < j){
                int sum = nums[k]+ nums[i]+nums[j];
                if (sum < 0) {
                    ++i;
                    while (i < j && nums[i] == nums[i - 1]) {
                        ++i;
                    }
                }else if (sum > 0) {
                    --j;
                    while (i < j && nums[j] == nums[j + 1]) {
                        --j;
                    }
                }else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    ++i;
                    while (i < j && nums[i] == nums[i - 1]) {
                        ++i;
                    }
                    --j;
                    while (i < j && nums[j] == nums[j + 1]) {
                        --j;
                    }
                }
            }
        }
        return list;
    }
}
