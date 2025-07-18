// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;
// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num : array){
//             // key, value;
//             // map에 키가 아무것도 없음.
//             // 1 : getOrdefault = 0 + 1
//             // 2 도 동일
//             // 첫번째 3 동일
//             // 두번째 3 getOrDefault = 이미 값이 1이 있음. 1 반환 / 1 + 1 = 2
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         int max = 0;
//         for (int key : map.keySet()){
//             if (max < map.get(key)){
//                 max = map.get(key);
//                 answer = key;
//             }
//         }

//         int cnt = 0;
//         for (int key : map.keySet()){
//             if (max == map.get(key)){
//                 cnt++;
//             }
//         }
//         if (cnt > 1)
//             answer = -1;

//         return answer;
//     }
// }
import java.util.*; 
class Solution{
    public int solution(int[] array){
        
        int answer = -1;
        Map <Integer, Integer> countMap = new HashMap<>();
        for(int a : array){
            countMap.put(a, countMap.getOrDefault(a,0) + 1);
        }
        // 여기서 가장 value가 큰 key값 찾아야 하는데
        int max = -1;
        int maxCount = 0;
        boolean isDuplicate = false;
        
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) { 
            int value = entry.getValue();
            int key = entry.getKey();
            
            if(value > maxCount){
                maxCount = value;
                answer = key;
                isDuplicate = false;
                
            } else if (value == maxCount){
                isDuplicate = true;
            }
        }
        
        return isDuplicate ? -1 : answer;
    }
}

