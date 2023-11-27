package easy.Single_Row_Keyboard;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * @param keyboard: Customized keyboard strings
     * @param word: A string
     * @return: Total number of moves
     */
    public int calculateTime(String keyboard, String word) {
        // write your code here
        int times = 0;
        Map<Character,Integer> charIdxMap = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            charIdxMap.put(keyboard.charAt(i),i);
        }
        int lastIdx = 0;
        for (char c : word.toCharArray()) {
            int idx = charIdxMap.get(c);
            times += Math.abs(lastIdx - idx);
            lastIdx = idx;
        }
        return times;
    }

    public static void main(String[] args) {
//        String keyboard = "abcdefghijklmnopqrstuvwxyz";
//        String word = "abc";

        String keyboard =  "gsdwqxfavuhbimkeycptnrzljo";
        String word = "lintcode";
        Solution solution = new Solution();
        int times = solution.calculateTime(keyboard, word);
        System.out.println(times);
    }
}
