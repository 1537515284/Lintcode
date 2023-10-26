package easy.Two_Sum_Less_Than_Target;

import java.util.Arrays;

public class Solution {
    /**
     * @param nums: An array of integer
     * @param target: An integer
     * @return: The sum of two numbers smaller than target
     */
    // Exhaustion
    public int twoSumLessThanTarget_(int[] nums, int target) {
        // write your code here
        int maxSum = Integer.MIN_VALUE;;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int temp = nums[i] + nums[j];
                if(temp < target && temp > maxSum){
                   maxSum = temp;
                }
            }
        }
        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }

    /**
     * @param nums: An array of integer
     * @param target: An integer
     * @return: The sum of two numbers smaller than target
     */
    public int twoSumLessThanTarget(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int maxSum = Integer.MIN_VALUE;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum < target){
                maxSum = Math.max(maxSum, sum);
                left++;
            }else{
                right--;
            }
        }
        return maxSum != Integer.MIN_VALUE ? maxSum : -1;
    }



    public static void main(String[] args) {
        int[] nums = {201, -197, -289, -242, 128, 277, -203, 13, -177, 173, -267, -284, 122, 75, 48, -172, -5, 215, -297, -191};
        int[] nums2 = {-292, 272, 35, -40, -300, 101, 35, -206, 248, -203, 14, -178, -21, 17, -278, 205, -121, -18, -269, -22};
        Solution solution = new Solution();
        int twoSum = solution.twoSumLessThanTarget(nums, 100);
        int twoSum2 = solution.twoSumLessThanTarget(nums2, 100);
        System.out.println(twoSum);
        System.out.println(twoSum2);
    }
}
