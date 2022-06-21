package recursion;

import java.util.*;

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

    /**
     * Recursion 2: find the height of a binary tree, first implementation
     * 
     * @param root the root node
     * @return the height of the tree
     */
    public static int getHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    /**
     * Recursion 2: find the size of a binary tree, first implementation
     * 
     * @param root the root node
     * @return the size of the tree
     */
    public static int getSize(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + getSize(root.left) + getSize(root.right);
    }    

    /**
     * Recursion 3: get the mirror of the binary tree, first implementation
     * 
     * @param root the root node
     * @return the root node of the mirrored tree
     */
    public static TreeNode<Integer> mirror(TreeNode<Integer> root) {
        if (root == null) {
            return root;
        }

        TreeNode<Integer> left = mirror(root.left);
        TreeNode<Integer> right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    /**
     * Recursion 4: get the mirror of the binary tree, second implementation
     * 
     * @param root the root node
     * @return the root node of the mirrored tree
     */
    public static TreeNode<Integer> mirror2(TreeNode<Integer> root) {
        if (root == null) {
            return root;
        }

        TreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror2(root.left);
        mirror2(root.right);

        return root;
    }    

    /**
     * Recursion 5: get the mirror of the binary tree, third implementation
     * 
     * Note: use iterative approach
     * 
     * @param root the root node
     * @return the root node of the mirrored tree
     */
    public static TreeNode<Integer> mirror3(TreeNode<Integer> root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        TreeNode<Integer> node;
        while(queue.size() > 0) {
            node = queue.remove();

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            TreeNode<Integer> temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        return root;
    }       
}
