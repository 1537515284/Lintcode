package easy.Shortest_Unsorted_Continuous_Subarray;

import java.util.Arrays;

public class Solution {

    /**
     * @param nums: an array
     * @return: the shortest subarray's length
     */
    public int findUnsortedSubarray(int[] nums) {
        // Write your code here
        int[] nums_sort = new int[nums.length];
        System.arraycopy(nums,0,nums_sort,0,nums.length);
        Arrays.sort(nums_sort);
        int ans = nums.length;
        while (ans > 0 && nums[ans-1] == nums_sort[ans-1]){
            ans--;
        }
        int i = 0;
        while (i < ans && nums[i] == nums_sort[i]){
            i++;
        }
        return ans - i;
    }


    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
//        int[] nums = {1,3,2,2,2};
        Solution solution = new Solution();
        int unsortedSubarray = solution.findUnsortedSubarray(nums);
        System.out.println(unsortedSubarray);
    }
}
