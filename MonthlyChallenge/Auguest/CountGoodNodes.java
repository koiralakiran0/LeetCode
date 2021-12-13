public class CountGoodNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        SolutionGoodNodes gNodes = new SolutionGoodNodes();
        System.out.println(gNodes.goodNodes(root));
    }
}

class SolutionGoodNodes {
    public int goodNodes(TreeNode root) {
        int count = 0;
        count+=dfs(root, root.val);
        return count;
    }
    
    public int dfs(TreeNode node, int max) {
        if (node == null) return 0;
        if (node.val >= max) {
            return dfs(node.left, node.val) + dfs(node.right, node.val) + 1;
        } else {
            return dfs(node.left, max) + dfs(node.right, max);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}