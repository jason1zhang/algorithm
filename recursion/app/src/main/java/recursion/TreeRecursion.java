package recursion;

import structures.*;

/**
 * Recursive algorithm implementations for Tree data structure.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-16
 */

public class TreeRecursion {
    /**
     * Recursion 1: Insert a node into a binary search tree, first implementation
     * 
     * @param root the root node
     * @return the new root of the tree
     */
    public static TreeNode<Integer> insertNode(TreeNode<Integer> root, int item) {
        if (root == null) {
            TreeNode<Integer> node = new TreeNode<Integer>(item);
            return node;
        }

        if (item < root.item) {
            root.left = insertNode(root.left, item);
        } else {
            root.right = insertNode(root.right, item);
        }

        return root;
    }
}
