import java.util.Arrays;
class Solution {
    public static int[] solution(long n) {
        String s = Long.toString(n);
        int answer[] = new int[s.length()];
        for (int i = s.length()-1 ; i >=0 ; i--) {
            answer[s.length()-1-i] = s.charAt(i)-'0';
            //0~9 -> 48 ~ 57 '2' = 50 - 48 = 2
        }

        return answer;
    }
}