// List를 사용해서 이전 값이랑 비교해서 다르면 add

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(list.isEmpty() || arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        answer =  new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}