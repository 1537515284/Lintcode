package easy.Largest_subarray;

import java.util.Arrays;

public class Solution {
    /**
     * @param a: the array
     * @param k: the length
     * @return: the largest subarray
     */
    public int[] largestSubarray(int[] a, int k) {
        // Write your code here.
        int startIdx = 0;   // 序列的开始下标
        for (int i = 1; i <= a.length-k; i++) {
            for (int j = 0; j < k; j++) {
                if(a[i+j] > a[j+startIdx]){
                    startIdx = i;
                    break;
                }else if(a[i+j] < a[j+startIdx]){
                    break;
                }
            }
        }
        return Arrays.copyOfRange(a,startIdx,startIdx+k);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        int k = 4;
        Solution solution = new Solution();
        int[] ans = solution.largestSubarray(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
