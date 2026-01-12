/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        if(head==null || head.next==null){
            return head.data;
        }
        Node prev=new Node(0);
        prev.next=head;
        Node slow=head,fast=head;
        while(fast.next!=null && slow!=null){
            if(fast.next.next==null){
                slow=slow.next;
                return slow.data;
            }
            prev=prev.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        // prev.next=prev.next.next;
        return slow.data;
    }
}