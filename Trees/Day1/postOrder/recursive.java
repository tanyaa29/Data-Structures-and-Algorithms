class Solution {
    ArrayList<Integer> arr = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        while (root == null)
            return arr;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        arr.add(root.val);
        return arr;

    }
}