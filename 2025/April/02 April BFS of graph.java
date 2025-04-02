
// User function Template for Java
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfsT = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[adj.size()];
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            bfsT.add(node);
            
            for(int nei:adj.get(node)){
                if(!vis[nei]){
                    q.add(nei);
                    vis[nei]=true;
                }
            }
        }
        
        return bfsT;
    }
}

