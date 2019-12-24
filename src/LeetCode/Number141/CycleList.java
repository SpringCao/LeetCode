package LeetCode.Number141;

public class CycleList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0,null);
        ListNode a = new ListNode(1,null);
        ListNode b = new ListNode(2,null);
        ListNode c = new ListNode(3,null);
        ListNode d = new ListNode(4,null);
        ListNode e = new ListNode(5,null);
        ListNode f = new ListNode(6,null);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);

        System.out.println(cycleList(head));
    }
    private static boolean cycleList(ListNode head){
        if (head == null || head.getNext() == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null){
            slow = head.getNext();
            fast = head.getNext().getNext();
            if (slow == fast) return true;
        }
        return false;
    }
}
