class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return 0;
        q.add(root);
        int h = 0;
        while (!q.isEmpty()) {
            h++;
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode tmp = q.poll();
                if (tmp.left != null)
                    q.add(tmp.left);
                if (tmp.right != null)
                    q.add(tmp.right);
            }

        }
        return h;
    }
}
