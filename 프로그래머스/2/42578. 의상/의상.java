// 가장 많은 경우의 수를 생각해보자
// 에시 문을 봤을 때 확통을 생각해보면 2C1, 1C1 ,1C1 을 모두 더해서 5가 됨.
// 그러니까 각 종류 별로 몇개가 있는지를 먼저생각해 봐야해. 
// 그리고 같은 종류의 옷을 함께 입을 수는 없어

/* 풀이 방법 1.
1. Map을 이용해 각 종류별로 몇개의 옷이 있는지 확인하자
2. 각 종류의 개수를 모두 더하면 끝?
*/
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map <String, Integer> map = new HashMap<>();
        
        //종류별 개수 세기
        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1] , 0) + 1);
        }
        
        for(int value : map.values()){
             answer *= (value + 1);
        }
        
     return answer -1;   
    }
    
}