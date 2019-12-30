package LeetCode.Number213;

import sun.nio.cs.ext.MacHebrew;

//你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。
// 这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。
// 同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
public class RobII {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,7,9};
        System.out.println(rob(a));
    }
    
    //因为此时为环形房屋，所以如果抢了第一个房屋，最后一个房屋就不能抢
    //如果抢了最后一个房屋，那么第一个房屋就不能抢
    //把数组划分成两段
    //第一段[0,1,2,3...n-2]
    //第二段[1,2,3...n-1]
    //比较两段的最大值
    private  static int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < n-1; i++) {
            dp[i] = dp[i-2]+nums[i] > dp[i-1] ? dp[i-2]+nums[i]:dp[i-1];
        }
        int max1 = dp[n-2];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1],nums[2]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        int max2 = dp[n-1];
        return Math.max(max1,max2);
    }
}
