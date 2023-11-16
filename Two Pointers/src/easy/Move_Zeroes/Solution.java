package easy.Move_Zeroes;

import java.util.Arrays;

public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes_(int[] nums) {
        // write your code here
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int nonZeroIdx = i + 1;
                while (nonZeroIdx < nums.length && nums[nonZeroIdx] == 0) {
                    nonZeroIdx++;
                }
                if (nonZeroIdx >= nums.length) {
                    return;
                }
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = 0;
            }
        }
    }

    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != left) {
                    int temp = nums[left];
                    nums[left] = nums[i];
                    nums[i] = temp;
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, -3, 4, 0, 1, 0, -2, 0, 0, 1 };
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
