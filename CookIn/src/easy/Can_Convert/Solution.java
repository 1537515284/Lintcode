package easy.Can_Convert;

public class Solution {

    /**
     * @param s: string S
     * @param t: string T
     * @return: whether S can convert to T
     */
    public boolean canConvert(String s, String t) {
        // Write your code here
        if(s == null || t == null){
            return false;
        }
        int p1 = 0;
        int p2 = 0;
        while (p1 < s.length() && p2 < t.length()) {
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
            }else{
                p1++;
            }
        }
        return p2 == t.length();
    }

    public static void main(String[] args) {
        String S = "lintcode";
        String T = "lint";
        Solution solution = new Solution();
        boolean res = solution.canConvert(S, T);
        System.out.println(res);
    }
}
