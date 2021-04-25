/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int size = getSize(root, 0);
        return size;
    }
    
    public int getSize(TreeNode node, int size) {
        if (node.left != null) getSize(node.left, size);
        if (node.right != null) getSize(node.right, size);
        return size + 1;
    }
}