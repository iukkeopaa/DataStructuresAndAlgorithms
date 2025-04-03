public class BinaryTreeTraversal {
    // 前序遍历：根节点 -> 左子树 -> 右子树
    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历：左子树 -> 根节点 -> 右子树
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历：左子树 -> 右子树 -> 根节点
    public static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        // 构建一个简单的二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("前序遍历结果: ");
        preOrderTraversal(root);
        System.out.println();

        System.out.print("中序遍历结果: ");
        inOrderTraversal(root);
        System.out.println();

        System.out.print("后序遍历结果: ");
        postOrderTraversal(root);
        System.out.println();
    }
}    