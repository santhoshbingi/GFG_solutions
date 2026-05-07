class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs = new ArrayList<>();
        
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty()) {
            int Node = q.poll();
            bfs.add(Node);
            
            for(int it : adj.get(Node)) {
                if(visited[it] == false) {
                    visited[it] = true;
                    q.offer(it);
                }
            }
        }
        return bfs;
    }
}