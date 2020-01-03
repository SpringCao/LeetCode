package LeetCode.Number53;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = {-1,2,3,6,4,-1};
        System.out.println(maxSubArray(a));
    }
    private static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] > 0) nums[i] = nums[i-1]+nums[i];
            maxSum = Math.max(maxSum,nums[i]);
        }
        return maxSum;
    }
}
