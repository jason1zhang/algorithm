import java.util.*;

/**
 * The implementation of binary tree algorithms.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-22
 */

public class BinaryTree<T extends Comparable<T>> {

    /**
     * print the tree leave rooted at the current node
     */
    public void printLeaves(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.value + ", ");
            return;
        }

        printLeaves(node.left);
        printLeaves(node.right);
    }

    public void printTree(TreeNode<T> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + ", ");
        if (node.left != null) {
            printTree(node.left);
        }

        if (node.right != null) {
            printTree(node.right);
        }

        return;
    }

    /**
     * print the tree rooted at the current node in level order
     * 
     * @param root the root node of the binary tree
     */
    public void printTreeLevel(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode<T>> queue = new LinkedList<>();

        TreeNode<T> node;

        queue.add(root);
        while (queue.size() > 0) {
            node = queue.remove();
            System.out.print(node.value + ", ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * Insert a node into a binary search tree
     * 
     * @param root the root node
     * @return the new root of the tree
     */
    public TreeNode<T> insertNode(TreeNode<T> root, T value) {
        if (root == null) {
            TreeNode<T> node = new TreeNode<T>(value);
            return node;
        }

        if (value.compareTo(root.value) < 0) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    /**
     * Recursion 2: find the height of a binary tree, first implementation
     * 
     * @param root the root node
     * @return the height of the tree
     */
    public int getHeight(TreeNode<T> root) {
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
    public int getSize(TreeNode<T> root) {
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
    public TreeNode<T> mirror(TreeNode<T> root) {
        if (root == null) {
            return root;
        }

        TreeNode<T> left = mirror(root.left);
        TreeNode<T> right = mirror(root.right);

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
    public TreeNode<T> mirror2(TreeNode<T> root) {
        if (root == null) {
            return root;
        }

        TreeNode<T> temp = root.left;
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
    public TreeNode<T> mirror3(TreeNode<T> root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        TreeNode<T> node;
        while(queue.size() > 0) {
            node = queue.remove();

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            TreeNode<T> temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        return root;
    }         

    /**
     * Check if two binary trees are the same
     * 
     * @param root1 root node of the first tree
     * @param root2 root node of the second tree
     * @return true if two binary tree are the same, false otherwise
     */
    public boolean isSameTree(TreeNode<T> root1, TreeNode<T> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.value != root2.value) {
            return false;
        } 
        
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }

    /**
     * Given a binary tree, determine if it is height-balanced.
     * a height-balanced binary tree is defined as:
     *      - a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
     * 
     * Note: leetcode #110
     * 
     * @param root the root node of the tree
     * @return true if the tree is balanced, false otherwise
     */
    public boolean isBalanced(TreeNode<T> root) {
        if (root == null) {
            return true;
        }

        if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}
