class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[]= new boolean[V];
        ArrayList<Integer> bfs= new ArrayList<>();
        
                Queue<Integer> q= new LinkedList<>();
                q.add(0);
                vis[0]= true;
                while(!q.isEmpty())
                {
                    Integer node= q.poll();
                    bfs.add(node);
                    for(int itr:adj.get(node))
                    {
                        if(vis[itr]==false){
                            vis[itr]=true;
                            q.add(itr);
                        }
                    }
                }
            
        
        return bfs;
    }
}