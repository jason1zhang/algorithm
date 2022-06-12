/**
 * Recursive algorithm implementations to a wide variety of problems.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-01
 */

package recursion;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

        // String Recursion Demo
        System.out.println("\n------------------- String Recursion -------------------");
        System.out.println("1. String Reversal");
        String input1 = "Hello";
        System.out.printf("The reversal of {%s} is {%s}.\n\n", input1, StringRecursion.reverseString(input1));

        System.out.println("2. Palindrome");
        String input2 = "racecar";
        System.out.printf("Is the string {%s} is a palindrom? {%b}\n\n", input2, StringRecursion.isPalindrome(input2));

        // Other Recursion Demo
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

        // Array Recursion Demo
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

    }
}
