/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node insert = new Node(x);
        insert.next = head;
        head = insert;
        return head;
        
    }
}