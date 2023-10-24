package easy.Intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param a: first sequence
     * @param b: second sequence
     * @return: return ans
     */
    // Time Limit Exceeded
    public List<List<Integer>> intersection_(List<List<Integer>> a, List<List<Integer>> b) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            List<Integer> alist = a.get(i);
            int aMin = alist.get(0);
            int aMax = alist.get(1);
            for (int j = 0; j < b.size(); j++) {
                List<Integer> blist = b.get(j);
                int bMin = blist.get(0);
                int bMax = blist.get(1);
                if((aMin >= bMin && aMin <= bMax) || (aMax <= bMax && aMax >= bMin)){
                    List<Integer> onePosList = new ArrayList<>();
                    onePosList.add(i);
                    onePosList.add(j);
                    res.add(onePosList);
                }
            }
        }
        return res;
    }

    /**
     * @param a: first sequence
     * @param b: second sequence
     * @return: return ans
     */
    public List<List<Integer>> intersection(List<List<Integer>> a, List<List<Integer>> b) {
        // write your code here
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()){
            // lo 相交区间的起点 hi 终点
            int lo = Math.max(a.get(i).get(0),b.get(j).get(0));
            int hi = Math.min(a.get(i).get(1),b.get(j).get(1));
            if(lo <= hi){
                ans.add(new ArrayList<>(Arrays.asList(i,j)));
            }
            if(a.get(i).get(1) < b.get(j).get(1)){
                i++;
            }else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(0,3));
        a.add(Arrays.asList(7,10));
        List<List<Integer>> b = new ArrayList<>();
        b.add(Arrays.asList(-1,1));
        b.add(Arrays.asList(2,8));
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.intersection(a, b);
        System.out.println(lists);
    }
}
