package LeetCode.Number21;

class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
        next = null;
    }
}

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode lpre1=new ListNode(-1);
        ListNode lpre2=new ListNode(-1);
        ListNode l1=lpre1;
        ListNode l2=lpre2;
        int n=10;
        for(int i=0;i<n;i++){
            ListNode p=new ListNode(i);
            ListNode q=new ListNode(i+1);
            l1.next=p;
            l2.next=q;
            l1=p;
            l2=q;
        }
        ListNode res=mergeTwoLists2(lpre1.next,lpre2.next);
        while (res!=null){
            System.out.println(res.value);
            res=res.next;
        }
    }
    private static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode pre = new ListNode(-1);
        ListNode pre1 = pre;
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 != null && l2 != null){
            if (l1.value <= l2.value){
                pre1.next = l1;
                l1 = l1.next;
            }else {
                pre1.next = l2;
                l2 = l2.next;
            }
            pre1 = pre1.next;
        }
        if (l1 == null) pre1.next = l2;
        if (l2 == null) pre1.next = l1;
        return pre.next;
    }

    //法二：递归
    private static ListNode mergeTwoLists2(ListNode l1,ListNode l2){
        ListNode pre = new ListNode(-1);
        ListNode pre1 = pre;
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.value <= l2.value){
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists2(l2.next,l1);
            return l2;
        }
    }
}
