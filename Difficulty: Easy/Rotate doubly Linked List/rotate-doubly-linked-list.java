class Solution {
    public Node rotateDLL(Node head, int p) {
        // code here..
        Node tail = head;
        int length = 1;
        
        while(tail.next != null) {
            length++;
            tail = tail.next;
        }
        
        p = p % length;
        
        if(p == 0){
            return head;
        }
        
        tail.next = head;
        
        int count = 1;
        Node newTail = head;
        
        while(count < p) {
            count++;
            newTail = newTail.next;
        }
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}