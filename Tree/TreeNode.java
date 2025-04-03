class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4 parent;

    TreeNode4(int val) {
        this.val = val;
    }
}

class BinarySearchTree1 {
    // 查找节点的后继节点
    public TreeNode4 inorderSuccessor(TreeNode4 node) {
        if (node.right != null) {
            return minValue(node.right);
        }
        TreeNode4 p = node.parent;
        while (p != null && node == p.right) {
            node = p;
            p = p.parent;
        }
        return p;
    }

    // 查找节点的前驱节点
    public TreeNode4 inorderPredecessor(TreeNode4 node) {
        if (node.left != null) {
            return maxValue(node.left);
        }
        TreeNode4 p = node.parent;
        while (p != null && node == p.left) {
            node = p;
            p = p.parent;
        }
        return p;
    }

    private TreeNode4 minValue(TreeNode4 node) {
        TreeNode4 current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private TreeNode4 maxValue(TreeNode4 node) {
        TreeNode4 current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
}

    