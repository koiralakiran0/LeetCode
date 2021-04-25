public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        TreeNode node0 = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node0.left = node1;
        node0.right = node2;
        node2.left = node3;
        node2.right = node4;
       // TreeNode node = new TreeNode(3);

        System.out.println(solution.maxDepth(node0));
    }
}
