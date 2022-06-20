/**
 * Recursive algorithm implementations to a wide variety of problems.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-01
 */

package recursion;

import java.util.Arrays;

import structures.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

        // String Recursion Demo
        StringRecursion();

        // Array Recursion Demo
        ArrayRecursion();

        // List Recursion Demo
        ListRecursion();

        // Tree Recursion Demo
        TreeRecursion();

        // Other Recursion Demo
        OtherRecursion();        
    }

    private static void StringRecursion() {
        System.out.println("\n------------------- String Recursion -------------------");
        System.out.println("1. String Reversal");
        String input1 = "Hello";
        System.out.printf("The reversal of {%s} is {%s}.\n\n", input1, StringRecursion.reverseString(input1));

        System.out.println("2. Palindrome");
        String input2 = "racecar";
        System.out.printf("Is the string {%s} is a palindrom? {%b}\n\n", input2, StringRecursion.isPalindrome(input2));
        
    }

    private static void ArrayRecursion() {
        System.out.println("\n------------------- Array Recursion -------------------");
        System.out.println("1. Binary Search");
        int[] nums1 = { 1, 3, 4, 5, 8, 9, 10 };
        int target1 = 3;
        System.out.printf("The index of the target {%d} in the array is {%d}.\n\n", target1,
                ArrayRecursion.binarySearch(nums1, 0, nums1.length - 1, target1));

        System.out.println("2. Merge Sort");
        int[] nums2 = { 5, 3, 12, 9, 1 };
        System.out.print("The sort array is ");
        ArrayRecursion.mergeSort(nums2, 0, nums2.length - 1);
        Arrays.stream(nums2)
                .forEach(num -> System.out.print(num + " "));
        System.out.println("\n");                 
    }

    private static void ListRecursion() {
        System.out.println("\n------------------- List Recursion -------------------");
        System.out.println("1. List Reversal");
        ListNode<Integer> n1 = new ListNode<>(1);
        ListNode<Integer> n2 = new ListNode<>(2);
        ListNode<Integer> n3 = new ListNode<>(3);
        ListNode<Integer> n4 = new ListNode<>(4);
        ListNode<Integer> n5 = new ListNode<>(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode<Integer> head1 = ListRecursion.reverseList(n1);
        System.out.print("The reversal of the list is ");
        head1.printList();
        System.out.println("\n");        

        System.out.println("2. Merge two sorted lists");
        ListNode<Integer> n11 = new ListNode<>(1);  // head of first sorted list
        ListNode<Integer> n22 = new ListNode<>(3);
        ListNode<Integer> n33 = new ListNode<>(5);
        n11.next = n22;
        n22.next = n33;

        ListNode<Integer> n44 = new ListNode<>(2);  // head of second sorted list
        ListNode<Integer> n55 = new ListNode<>(4);
        ListNode<Integer> n66 = new ListNode<>(6);
        n44.next = n55;
        n55.next = n66;

        ListNode<Integer> head2 = ListRecursion.mergeList(n11, n44);    // merge two sorted list
        System.out.print("The merged list is ");
        head2.printList();
        System.out.println("\n");

    }

    private static void TreeRecursion() {
        System.out.println("\n------------------- Tree Recursion -------------------");
        System.out.println("1. Build a binary search tree and print the leaves");
        int[] nums = {8, 3, 6, 9, 7, 12, 15, 2};
        TreeNode<Integer> root1 = null;
        for (int num : nums) {
            root1 = TreeRecursion.insertNode(root1, num);
        }

        root1.printTreeLevel();
        System.out.println("\n");

        System.out.println("2. Get the height of a binary tree");
        System.out.printf("The height of the tree is %d\n\n", TreeRecursion.getHeight(root1));

        System.out.println("3. Get the size of a binary tree");
        System.out.printf("The size of the tree is %d\n\n", TreeRecursion.getSize(root1));

        System.out.println("4. Get the mirror of the binary tree");
        System.out.printf("The mirrored tree is ");
        TreeNode<Integer> root2 = TreeRecursion.mirror(root1);
        root2.printTreeLevel();
        System.out.println("\n");

    }

    private static void OtherRecursion() {
        System.out.println("\n------------------- Other Recursion -------------------");
        System.out.println("1. Decimal to Binary");
        int number1 = 233;
        System.out.printf("The decimal number {%d} converted to the binary is {%s}\n\n", number1,
                OtherRecursion.DecimalToBinary(number1, ""));

        System.out.println("2. Sum of Natural Numbers");
        int number2 = 10;
        System.out.printf("The sum of natural numbers from 1 to {%d} is {%d}.\n\n", number2,
                OtherRecursion.SumOfNumbers(number2));

        System.out.println("3. Fibonacci number");
        int number3 = 6;
        System.out.printf("The fibonacci of {%d} is {%d}.\n\n", number3, OtherRecursion.fib(number3));

    }    
}
