class Solution {
    // Function to return a list containing the inorder traversal of the tree.

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (curr != null) {
            st.push(curr);
            curr = curr.left;
        }
        while (curr == null && !st.isEmpty()) {
            arr.add(st.peek().data);
            curr = st.pop().right;
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
        }
        return arr;
    }

}