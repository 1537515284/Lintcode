package easy.complete_array;

import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param arr: array
     * @return: return true if it's a complete array, otherwise false
     */
    public boolean isCompleteArray(List<Integer> arr) {
        // write your code here
        int arrSum = arr.stream().mapToInt(Integer::intValue).sum();
        int size = arr.size();
        // 等差数列求和公式为：Sn = (n/2) * (a + l) 其中Sn表示等差数列的和，n表示项数，a表示首项，l表示末项。
        int targetSum = (size*(size+1))/2;
        return arrSum == targetSum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 2, 5);
        Solution sln = new Solution();
        boolean isCompleteArray = sln.isCompleteArray(list);
        System.out.println(isCompleteArray);
    }
}
