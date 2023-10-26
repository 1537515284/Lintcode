package easy.First_Position_of_Target;

public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] >= target){
                hi = mid;
            }else if(nums[mid] < target){
                lo = mid + 1;
            }
        }
        if(lo < 0 || lo > nums.length){
            return -1;
        }
        return nums[lo] == target ? lo : -1;
    }

    public static void main(String[] args) {
        int[] tuple = {3,4,5,8,8,8,8,10,13,14};
        int target = 8;
        Solution solution = new Solution();
        int index = solution.binarySearch(tuple, target);
        System.out.println(index);
    }
}
