package LeetCode.Number160;

//找出两个链表相交的节点
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class IntersectionNode {
    public static void main(String[] args) {
        Node nodeA1 = new Node(1);
        Node nodeA2 = new Node(2);
        Node nodeA3 = new Node(3);
        Node nodeA4 = new Node(4);
        Node nodeA5 = new Node(5);
        Node nodeA6 = new Node(6);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;
        nodeA4.next = nodeA5;
        nodeA5.next = nodeA6;

        Node nodeB1 = new Node(8);
        Node nodeB2 = new Node(9);
        Node nodeB3 = new Node(0);
        Node nodeB4 = new Node(7);
        nodeB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;
        nodeB4.next = nodeA4;

        Node a = getIntersectionNode(nodeA1,nodeB1);
        System.out.println(a.value);



    }

    private static Node getIntersectionNode(Node headA,Node headB){
        if (headA == null || headB == null){
            return null;
        }
        Node p1 = headA;
        Node p2 = headB;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
            if (p1 == null && p2 == null){
                return null;
            }
            if (p1 == null){
                p1 = headB;
            }
            if (p2 == null){
                p2 = headA;
            }
        }
        return p1;
    }
}
