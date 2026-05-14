/*
Definition for Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        
        if(root == null ) {
            return null;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        boolean lefttoright = true;
        int flag = 0;
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            
            ArrayList<Integer> level = new ArrayList<>();
                
                for(int i = 0; i < size; i++) {
                    
                    Node node = q.poll();
                    
                    level.add(node.data);
                    
                    if(node.left != null) {
                        q.offer(node.left);
                    }
                    
                    if(node.right != null) {
                        q.offer(node.right);
                    }
                }
                
                if(!lefttoright) {
                    
                    Collections.reverse(level);
                }
                
                result.addAll(level);
                lefttoright = !lefttoright;
                
            
        }
        return result;
    }
}