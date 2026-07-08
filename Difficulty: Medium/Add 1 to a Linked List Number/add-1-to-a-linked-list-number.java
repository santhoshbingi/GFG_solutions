/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    public Node reverse(Node head) {
        
        Node temp = head;
        Node prev = null;
        
        while(temp != null) {
            
            Node next =  temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        
        Node curr = head;
        int carry = 1;
        while(curr != null) {
            
            curr.data = curr.data + carry;
            if(curr.data < 10) {
                carry = 0;
                break;
            }
            
            else {
                curr.data = 0;
                carry = 1;
                
            }
            
            if(curr.next == null) {
                break;
            }
            curr = curr.next;
        }
        
        if(carry == 1) {
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;
        }
        head = reverse(head);
        return head;
    }
}