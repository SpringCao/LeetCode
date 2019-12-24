package LeetCode.Number24;

//两两交换链表中的节点
public class SwapPairs {
    public static void main(String[] args) {
//        int n=6;
//        Scanner input=new Scanner(System.in);
//        int[] nums=new int[n];
//        for (int i=0;i<n;i++){
//            nums[i]=input.nextInt();
//        }
//        System.out.println(maxSub(nums));

    }
    private static ListNode swapPairs(ListNode head){
        if (head == null || head.getNext() == null){
            return head;
        }
        ListNode next = head.getNext();
        head.setNext(swapPairs(next.getNext()));
        next.setNext(head);
        return next;
    }

//    private static int maxSub(int[] nums){
//        int[] dp=new int[nums.length];
//        dp[0]=nums[0];
//        int res=dp[0];
//        for(int i=1;i<nums.length;i++){
//
//        }
//        return res;
//    }
}
