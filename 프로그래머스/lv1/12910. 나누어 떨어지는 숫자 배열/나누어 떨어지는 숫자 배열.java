import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
              int [] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                al.add(arr[i]);
            }
        }
        if (al.isEmpty()) {
            al.add(-1);
        }
        answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}