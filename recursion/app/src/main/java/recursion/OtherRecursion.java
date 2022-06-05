package recursion;

public class OtherRecursion {
    /**
     * Recursion 1: Decimal to Binary number conversion, first implementation
     * 
     * @param number an integer
     * @return the binary representation of the decimal number
     */
    public static String DecimalToBinary1(int number) {
        if (number == 0) {
            return "";
        } else {
            return DecimalToBinary1(number / 2) + (number % 2);
        }    
    }

    /**
     * Recursion 1: Decimal to Binary number conversion, second implementation
     * 
     * @param number an integer
     * @param result the result string
     * @return the binary representation of the decimal number
     */
    public static String DecimalToBinary(int number, String result) {
        if (number == 0)  {
            return result;
        }

        result = number % 2 + result;
        return DecimalToBinary(number / 2, result);
    }    

    /**
     * Recursion 2: Sum of Natural Numbers, first implementation
     * 
     * @param number an integer
     * @return the sum of natural numbers from 1 to the number
     */
    public static int SumOfNumbers1(int number) {
        if (number == 1) {
            return number;
        } else {
            return number + SumOfNumbers1(number - 1);
        }
    }    

    /**
     * Recursion 2: Sum of Natural Numbers, second implementation
     * 
     * Note: Youtube channel "the Simple Engineer" - "Recursion in Programming - Full Course", at time 0:38:50 
     * 
     * @param number an integer
     * @return the sum of natural numbers from 1 to the number
     */
    public static int SumOfNumbers(int number) {
        if (number == 1) {
            return number;
        }

        return number + SumOfNumbers(number - 1);
    }      
}
