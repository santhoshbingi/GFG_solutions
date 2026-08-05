/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */
import java.util.*;
class Solution {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    
    public void addRightBoundary(Node root) {
        
        //ArrayList<Integer> dup = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        
        Node curr = root.right;
        while(curr != null) {
            
            if(!isLeaf(curr)) {
                st.push(curr.data);
            }
            
            if(curr.right != null) {
                curr = curr.right;
            }
            
            else {
                curr = curr.left;
            }
        }
        
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }
    }
    
    public void addLeaves(Node root) {
        
        if(root == null) {
            return ;
        }
        
        if(isLeaf(root)) {
            ans.add(root.data);
            return;
        }
        
        addLeaves(root.left);
        addLeaves(root.right);
        
    }
    
    public void addLeftBoundary(Node root) {
        
        Node curr = root.left;
        while(curr != null) {
            
            if(!isLeaf(curr)) {
                ans.add(curr.data);
            }
            
            if(curr.left != null) {
                curr = curr.left;
            }
            
            else {
                curr = curr.right;
            }
        }
    }
    
    public boolean isLeaf(Node root) {
        
        return root.left == null && root.right == null;
    }
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        
        if(root == null) {
            return ans;
        }
        
        if(isLeaf(root)) {
            ans.add(root.data);
            return ans;
        }
        
        ans.add(root.data);
        
        addLeftBoundary(root);
        addLeaves(root);
        addRightBoundary(root);
        return ans;
    }
}