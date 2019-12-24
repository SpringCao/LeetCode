package LeetCode.Number70;

public class ClimbStairs {
    public static void main(String[] args) {
        int a = climbStairs3(4);
        System.out.println(a);
    }
    private static int climbStairs1(int n){ //此方法虽然可行，但是时间复杂度太高了
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs1(n-1)+climbStairs1(n-2);
    }
    private static int climbStairs2(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2;i < n;++i){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    private static int climbStairs3(int n){
        if (n <=2 ) return n;
        int result = 0;
        int a = 1; //代表1阶的走法
        int b = 2; //代表2阶的走法
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
