/**
 * Tests of tree algorithms.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-22
 */

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree<Integer> tree = new BinaryTree<>();

        System.out.println("\n------------------- Tree Recursion -------------------");
        System.out.println("1. Build a binary search tree and print the leaves");
        int[] nums = {8, 3, 6, 9, 7, 12, 15, 2};
        TreeNode<Integer> root1 = null;
        for (int num : nums) {
            root1 = tree.insertNode(root1, num);
        }

        tree.printTreeLevel(root1);
        System.out.println("\n");

        System.out.println("2. Get the height of a binary tree");
        System.out.printf("The height of the tree is %d\n\n", tree.getHeight(root1));

        System.out.println("3. Get the size of a binary tree");
        System.out.printf("The size of the tree is %d\n\n", tree.getSize(root1));

        System.out.println("4. Get the mirror of the binary tree");
        System.out.printf("The mirrored tree is ");
        TreeNode<Integer> root2 = tree.mirror(root1);
        tree.printTreeLevel(root2);
        System.out.println("\n");

        System.out.printf("The mirrored tree is ");
        TreeNode<Integer> root3 = tree.mirror2(root2);
        tree.printTreeLevel(root3);
        System.out.println("\n");

        System.out.printf("The mirrored tree is ");
        TreeNode<Integer> root4 = tree.mirror3(root3);
        tree.printTreeLevel(root4);
        System.out.println("\n");     

        System.out.printf("Tree1 and tree2 is the same? %b\n", tree.isSameTree(root1, root2));
        System.out.printf("Tree2 and tree4 is the same? %b\n", tree.isSameTree(root2, root4));
        System.out.println("\n");             

        System.out.printf("Is the tree balanced? %b\n", tree.isBalanced(root4));
        System.out.println("\n");
    }
}
