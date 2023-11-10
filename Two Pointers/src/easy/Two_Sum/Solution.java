package easy.Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum_(int[] numbers, int target) {
        // write your code here
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i],i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target-numbers[i]) && map.get(target-numbers[i]) != i){
                return new int[]{i,map.get(target-numbers[i])};
            }
        }
        return new int[]{};
    }
    
    public static void main(String[] args) {
        // int[] numbers = {2,7,11,15};
        // int target = 9;
        int[] numbers = {1,3,-1};
        int target = 2;
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(twoSum));
    }
}
