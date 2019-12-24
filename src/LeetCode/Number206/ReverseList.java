package LeetCode.Number206;

public class ReverseList {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4,null);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        ListNode p=reverseList(node1);
        while (p!=null){
            System.out.print(p.getValue()+"\t");
            p=p.getNext();
        }
    }
    private static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode now = head;
        while (now != null){
            ListNode next = now.getNext();
            now.setNext(pre);
            pre = now;
            now = next;
        }
        return pre;
    }
}
