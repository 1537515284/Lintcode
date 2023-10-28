package easy.Hexspeak;


public class Solution {

    /**
     * @param n: the positive number
     * @return: the string of hexspeak
     */
    public String toHexspeak_(int n) {
        // write your code here
        String s = Integer.toHexString(n);
        for (char c : s.toCharArray()) {
            if(!(c >= 'a' && c <= 'f') && !(c >= '0' && c <= '1')){
                return "ERROR";
            }
        }
        if(s.indexOf('0') > -1){
            s = s.replaceAll("0","O");
        }
        if(s.indexOf('1') > -1){
            s = s.replaceAll("1","I");
        }
        return s.toUpperCase();
    }

    /**
     * @param n: the positive number
     * @return: the string of hexspeak
     */
    public String toHexspeak(int n) {
        // write your code here
        char[] chars = Integer.toHexString(n).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '2' && chars[i] <= '9'){
                return "ERROR";
            }
            else if(chars[i] == '0'){
                chars[i] = 'O';
            }else if(chars[i] == '1'){
                chars[i] = 'I';
            }else{
                chars[i] -= 32;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 7950;
        String s = solution.toHexspeak(n);
        System.out.println(s);
        System.out.println('a'-' ');
        System.out.println('a'-'0');
        System.out.println('b'>='a');
    }
}
