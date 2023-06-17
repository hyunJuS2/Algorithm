import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = -1; // 0 ~ 9
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] != num){ 
                list.add(arr[i]);
                num = arr[i]; //1 3 0
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}