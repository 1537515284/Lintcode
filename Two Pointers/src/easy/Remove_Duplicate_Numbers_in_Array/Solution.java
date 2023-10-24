package easy.Remove_Duplicate_Numbers_in_Array;

import java.util.Arrays;

public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    // Time Limit Exceeded
    public int deduplication_(int[] nums) {
        // write your code here
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if(nums[i] == nums[j]){
                    int x = j;
                    while(nums[i] == nums[x]){
                        x++;
                        if(x == nums.length){
                           return i+1;
                        }
                    }
                    nums[j] = nums[x];
                }
            }
        }
        return nums.length;
    }

    /**
     * @param nums an array of integers
     * @return the number of unique integers
     */
    public int deduplication(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,1,4,4,2};
        Solution solution = new Solution();
        int num = solution.deduplication(nums);
        System.out.println(num);
        System.out.println(Arrays.toString(nums));
    }
}
