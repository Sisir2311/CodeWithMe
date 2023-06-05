class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>(V);
        for(int i = 0;i < V;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(i);
            for(int j = 0;j < adj.get(i).size();j++){
                temp.add(adj.get(i).get(j));
            }
            map.add(temp);
        }
        return map;
    }
}
