class Solution {
    public List<Integer> postorderTraversal(TreeNode root)
    {
            ArrayList<Integer> arr= new ArrayList<>();
        if(root==null)
            return arr;
        Stack<TreeNode> s1= new Stack<>();
        Stack<TreeNode> s2= new Stack<>();
        s1.add(root);
        while(!s1.isEmpty())
        {
            TreeNode curr= s1.pop();
            s2.push(curr);
            if(curr.left!=null)
                s1.push(curr.left);
            if(curr.right!=null)
                s1.push(curr.right);
        }
        while(!s2.isEmpty())
        {
            TreeNode curr= s2.pop();
            arr.add(curr.val);
        }
        return arr;
        
    }
}
