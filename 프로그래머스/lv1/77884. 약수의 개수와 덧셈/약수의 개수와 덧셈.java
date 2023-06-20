import java.util.LinkedHashMap;
import java.util.Map;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        Map<Integer, Integer> intMap = new LinkedHashMap<>();
        for (int i = left; i <=right ; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            intMap.put(i,count);
            count = 0;
        }
        for(Integer key : intMap.keySet()){
            if(intMap.get(key) % 2 ==0){
                answer+= key;
            } else answer-= key;
        }

        return answer;
    }
}