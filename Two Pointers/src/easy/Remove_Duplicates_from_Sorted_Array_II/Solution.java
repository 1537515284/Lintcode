package easy.Remove_Duplicates_from_Sorted_Array_II;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates_(int[] nums) {
        // write your code here
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) <= 2){
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int left = 0; // 指向需要修改的位置
        int count = 1; // 记录当前元素出现的次数
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[left]) {
                count++; // 更新当前元素出现的次数
                if (count <= 2) {
                    left++; // 更新 left 指针位置
                    nums[left] = nums[i]; // 修改数组
                }
            } else {
                left++; // 更新 left 指针位置
                nums[left] = nums[i]; // 修改数组
                count = 1; // 重置当前元素出现次数
            }
        }
        return left + 1; // 返回最终数组的长度
    }


    
    public static void main(String[] args) {
        int[] array = {0,1,1,1,2,2,3};
        Solution solution = new Solution();
        int length = solution.removeDuplicates(array);
        System.out.println(length);
        System.out.println(Arrays.toString(array));
    }
    
}
