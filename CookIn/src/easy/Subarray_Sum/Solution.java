package easy.Subarray_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the
     *          index of the last number
     */
    public List<Integer> subarraySum_(int[] nums) {
        // write your code here
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return new ArrayList<Integer>(Arrays.asList(i, i));
            }
            sum += nums[i];
            if (sum == 0) {
                return new ArrayList<Integer>(Arrays.asList(0, i));
            }
            if (map.containsKey(sum)) {
                return new ArrayList<Integer>(Arrays.asList(map.get(sum), i));
            }
            map.put(sum, i + 1);
        }
        return new ArrayList<>();
    }

    /**
     * @param nums: 一个整数列表
     * @return: 包含第一个数的索引和最后一个数的索引的整数列表
     */
    public List<Integer> subarraySum(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        int currentSum = 0;

        Map<Integer, Integer> sumIndicesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return Arrays.asList(i, i);
            }
            currentSum += nums[i];
            if(currentSum == 0){
                 return Arrays.asList(0, i);
            }
            if (sumIndicesMap.containsKey(currentSum)) {
                return Arrays.asList(sumIndicesMap.get(currentSum), i);
            }
            sumIndicesMap.put(currentSum, i + 1);
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        int[] nums = { -4,4, 6, 3, -9, -5, 1, 3, 0, 2 };
        Solution solution = new Solution();
        List<Integer> subarraySum = solution.subarraySum(nums);
        System.out.println(subarraySum);
    }
}
