package recursion;

public class StringRecursion {

    /**
     * Recursion 1: string reversal, first implementation
     * 
     * @param input a string
     * @return the reversal of the input string
     */
    public static String reverseString1(String input) {
        int len = input.length();

        if (len == 1) {
            return input;
        } else {
            return input.charAt(len - 1) + reverseString1(input.substring(0, len - 1));
        }
    }

    /**
     * Recursion 1: string reversal, second implementation
     * 
     * @param input a string
     * @return the reversal of the input string
     */
    public static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        }

        return reverseString(input.substring(1)) + input.charAt(0);
    }    

    /**
     * Recusion 2: check if a string is a palindrome, 1st implementation
     * 
     * @param input a string
     * @return true if the string is a palindrome, otherwise false
     */
    public static boolean isPalindrome1(String input) {
        int len = input.length();
        if (len == 0 || len == 1) {
            return true;
        }

        if (input.charAt(0) != input.charAt(len - 1)) {
            return false;
        }

        return isPalindrome1(input.substring(1, len - 1));
    }

    /**
     * Recusion 2: check if a string is a palindrome, 2nd implementation
     * 
     * @param input a string
     * @return true if the string is a palindrome, otherwise false
     */
    public static boolean isPalindrome(String input) {
        int len = input.length();

        if (len == 0 || len == 1) {
            return true;
        }

        if (input.charAt(0) == input.charAt(len - 1)) {
            return isPalindrome(input.substring(1, len - 1));
        }

        return false;
    }    
}

