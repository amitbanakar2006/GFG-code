/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        if(head1==null && head2==null){
            return null;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        // code here
        Node prev1=null,prev2=null,curr1=head1,curr2=head2,Next1=head1.next,Next2=head2.next;
        // prev1.next=head1;prev2.next=head2;
        Node dummy=new Node(0);
        Node tail=dummy;
        while(curr1!=null ){
            Next1=curr1.next;
            
            
            curr1.next=prev1;
           
            
            prev1=curr1;
            
            
            curr1=Next1;
        
            
            
        }
        while( curr2!=null){
            
            Next2=curr2.next;
            
           
            curr2.next=prev2;
            
            
            prev2=curr2;
            
      
            curr2=Next2;
            
            
        }
        
        int carry=0,sum=0;
        while(prev1!=null || prev2!=null ||carry!=0){
            sum=((prev1!=null)?prev1.data:0) + ((prev2!=null)?prev2.data:0) + carry;
            prev1=(prev1!=null)?prev1.next:null;
            prev2=(prev2!=null)?prev2.next:null;
            carry=sum/10;
           tail.next   = new Node(sum%10);
           tail=tail.next;
            
        }
        Node prev=null,curr=dummy.next,Next=null;
        
         while(curr!=null){
            Next=curr.next;
          
            
            curr.next=prev;
            
            
            prev=curr;
           
            
            curr=Next;
            
            
            
        }
        Node help=new Node(0);
        // help=null;
        help.next=prev;
        while(prev.data==0){
            help.next=help.next.next;
            prev=prev.next;
            
        }
        
        
        
        return prev;
    }
}