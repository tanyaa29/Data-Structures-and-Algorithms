class Solution {
    ArrayList<Integer> arr= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        if(root==null)
            return arr;
        arr.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return arr;
        
    }
}