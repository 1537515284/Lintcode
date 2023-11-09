package easy.Merge_Two_Sorted_Arrays;

import java.util.Arrays;

public class Solution {
        /**
     * @param a: sorted integer array A
     * @param b: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] a, int[] b) {
        // write your code here
        int[] ans = new int[a.length + b.length];
        int len = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if(a[p1] >= b[p2]){
                ans[len++] = b[p2];
                p2++;
            }else{
                ans[len++] = a[p1];
                p1++;
            }
        }
        if(p1 == a.length){
            for (int i = p2; i < b.length; i++) {
                ans[len++] = b[i];   
            }
        }
        if(p2 == b.length){
            for (int i = p1; i < a.length; i++) {
                ans[len++] = a[i];   
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {2,4,5,6,7};
        Solution solution = new Solution();
        int[] mergeSortedArray = solution.mergeSortedArray(A, B);
        System.out.println(Arrays.toString(mergeSortedArray));
    }
}
