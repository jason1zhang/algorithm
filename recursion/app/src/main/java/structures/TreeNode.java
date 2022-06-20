package structures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> {
    public T item;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
    
    /**
     * print the tree leave rooted at the current node
     */
    public void printLeaves() {
        printLeaves(this);

    }

    private void printLeaves(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.item + ", ");
            return;
        }

        printLeaves(node.left);
        printLeaves(node.right);
    }

    /**
     * print the tree rooted at the current node
     */
    public void printTree() {
        printTree(this);
    }

    /**
     * print the tree rooted at the current node in level order
     */
    public void printTreeLevel() {
        printTreeLevel(this);
    }

    private void printTree(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.item + ", ");
        if (node.left != null) {
            printTree(node.left);
        }

        if (node.right != null) {
            printTree(node.right);
        }

        return;
    }

    private void printTreeLevel(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode<T>> queue = new LinkedList<>();

        TreeNode<T> node;

        queue.add(root);
        while (queue.size() > 0) {
            node = queue.remove();
            System.out.print(node.item + ", ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
