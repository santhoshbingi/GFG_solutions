class Solution {
    
    public void dfsTraversal(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfs) {
        
        visited[node] = true;
        dfs.add(node);
        
        for(int it : adj.get(node)) {
            if(!visited[it]) {
                dfsTraversal(it,adj,visited,dfs);
            }
        }
        
        
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        
        dfsTraversal(0, adj, visited, dfs);
        
        return dfs;
        
    }
}