class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root == null)
            return arr;
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            arr.add(curr.val);
            if (curr.right != null)
                st.push(curr.right);
            if (curr.left != null)
                st.push(curr.left);
        }
        return arr;
    }
}
