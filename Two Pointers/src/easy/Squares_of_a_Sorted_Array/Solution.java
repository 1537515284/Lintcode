package easy.Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class Solution {

    /**
     * @param a: The array A.
     * @return: The array of the squares.
     */
    // no good
    public int[] squareArray_(int[] a) {
        // write your code here
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.pow(a[i], 2);
        }
        Arrays.sort(a);
        return a;
    }

    /**
     * @param a: The array A.
     * @return: The array of the squares.
     */
    // good
    public int[] squareArray(int[] nums) {
        // write your code here
        int i = 0, j = nums.length - 1;
        int[] output = new int[nums.length];
        
        while (i <= j) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];
            output[j - i] = Math.max(a, b);
            i += (a > b) ? 1 : 0;
            j -= (a > b) ? 0 : 1;
        }
        return output;
    }

    
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        Solution solution = new Solution();
        int[] squareArray = solution.squareArray(nums);
        System.out.println(Arrays.toString(squareArray));
    }
}
