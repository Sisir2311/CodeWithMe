class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
                ans.add(curr);
            ArrayList<Integer> temp = adj.get(curr);
            for(int i = 0;i< temp.size();i++){
                if(!vis[temp.get(i)]){
                    q.add(temp.get(i));
                    vis[temp.get(i)] = true;
                }
            }
        }
        return ans;
    }
}
