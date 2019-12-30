package LeetCode.Number198;

//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
// 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
// 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
//
public class Rob {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        System.out.println(rob(a));
    }

    private static int rob(int[] nums){   //时间复杂度为O(n),空间复杂度为O(n)
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-2]+nums[i]> dp[i-1] ? dp[i-2]+nums[i]:dp[i-1];
        }
        return dp[n-1];
    }
}
