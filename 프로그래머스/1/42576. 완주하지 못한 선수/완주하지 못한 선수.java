/* 풀이 방법
1. HashMap 사용 - participant 의 이름을 key로 value 는 기본 값 0 동명이인의 경우 +1
2. completion과 일치하는 경우 -1을 해주고 
3. map에서 value가 0이 아닌 경우를 출력하기 
*/

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap <String,Integer> map = new HashMap<>();
        for(String p : participant){
            map.put(p, map.getOrDefault(p,0)+1); //(key, value)
        }
        for(String c : completion){
            map.put(c, map.get(c) -1);
        }
        for(String key : map.keySet()){
            if(map.get(key) !=0){
                answer = key;
            }
        }
        return answer;
    }
}