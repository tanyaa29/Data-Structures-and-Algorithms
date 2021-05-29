class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr = new ArrayList<>();
      if(root==null)
      return arr;
      Queue<Node> q= new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
          int s= q.size();
          for(int i=0;i<s;i++)
          {
              Node curr= q.poll();
              if(i==0)
              arr.add(curr.data);
              if(curr.left!=null)
              q.add(curr.left);
              if(curr.right!=null)
              q.add(curr.right);
              
          }
      }
      return arr;
    }
}