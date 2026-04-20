/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        
        if(head == null || head.next == null) {
            return null;
        }
        Node current = head;
        
        while(current.next.next != null) {
            
            current = current.next;
        }
        
        current.next = null;
        return head;
    }
}