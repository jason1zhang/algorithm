package recursion;

/**
 * Recursive algorithm implementations for Array data structure.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-12
 */

public class ArrayRecursion {

    /**
     * Recursion 1: Binary search, first implementation
     * 
     * @param nums an sorted integer array
     * @param left the lower bound of the array
     * @param right the upper bound of the array
     * @param target the target integer to search for
     * 
     * @return the index of the target in the array if found, otherwise -1
     */    
    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch(nums, left, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, right, target);
        }
    }

    /**
     * Recursion 2: Merge Sort, first implementation
     * 
     * @param nums an integer array
     * @param left the lower bound of the array
     * @param right the upper bound of the array
     */   
    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        // a temp array to avoid modifying the original array contents
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        // both sub-arrays have values, then try and merge them in sorted order
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // add the rest of valus from the left sub-array into the result
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // add the rest of values from the right sub-array into the result
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // copy the sorted result into the original array
        for (i = left; i <= right; i++) {
            nums[i] = temp[i - left];
        }
    }



}
