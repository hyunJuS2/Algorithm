import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] str = s.split("");
        Arrays.sort(str,Collections.reverseOrder());
        String result = String.join("",str);
        answer = Long.parseLong(result);
        return answer;
    }
}