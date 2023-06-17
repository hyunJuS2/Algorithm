import java.util.Arrays;
class Solution {
    public static int[] solution(long n) {
        String s = Long.toString(n);
        int length = s.length();
        int[] answer = new int[length];
        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n % 10);
            n = n/10;
            i++;
        }

        return answer;
    }
}