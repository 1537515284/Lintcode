package easy.Merge_Sorted_Array_Easy_Version;

import java.util.Arrays;

public class Solution {

    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        System.arraycopy(B, 0, A, m, n);
        Arrays.sort(A);
    }
    
    public static void main(String[] args) {
        int[]A = {1,2,5,0,0};
        int m = 3;
        int[] B = {3,4};
        int n = 2;
        Solution solution = new Solution();
        solution.mergeSortedArray(A, m, B, n);
        System.out.println(Arrays.toString(A));
    
    }
}
