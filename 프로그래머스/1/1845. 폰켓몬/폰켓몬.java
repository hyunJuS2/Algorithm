/* 풀이 방법 
1. 모든 포켓몬을 HashSet에 넣어 중복을 없앤다. 그 값을 Poket이라고 한다면
2. N/2개를 보다 Poket이 크면 N/2개 , N/2 보다 Poket이 작으면 Poket 개수 만큼 가져갈 수 있다.
*/
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> poket = new HashSet<>();
        
        for(int num :nums){
            poket.add(num);
        }
    
        if(nums.length / 2 > poket.size() ) {
            answer = poket.size();
        }
        else answer = nums.length / 2;
        return answer;
    }
}