package LeetCode.Number237;


import java.util.List;

//请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteNode(node2);
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    //输入的节点即为要删除的节点
    public static void deleteNode(ListNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
