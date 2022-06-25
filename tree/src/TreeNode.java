/**
 * Binary Tree Node
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-22
 */

public class TreeNode<T extends Comparable<T>> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
