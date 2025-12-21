// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node prevNode = null;
        Node temp = head;
        Node nextNode = null;
        
        while(temp != null) {
            
            if(temp.data == x) {
                
                if(temp == head) {
                    head = temp.next;
                }
                prevNode = temp.prev;
                nextNode = temp.next;
                
                if(prevNode != null) {
                    prevNode.next = nextNode;
                }
                if(nextNode != null) {
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}