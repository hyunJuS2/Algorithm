/* 
계산 식 -> 99 = progress[i] + speeds[i] * day
-> day = (99 - progress[i]) / speeds[i] + 1

풀이 방법 1.
1. queue를 확용하여 day 값을 progress의 순서대로 다 넣는다.
2. 맨 앞 값을 뺀다(poll()) -> 이때 다음 값을 보고 뺀 값보다 작으면 같이 뺀다 sum + 1
그 다음 list에 값에 넣는다.(배열은 안됨. 크기 지정 불가능)
3. answer배열에 list값을 너는다.
*/
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int day = 0;
        int count = 1;
        
        Queue <Integer> que = new LinkedList<>();
        List <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            day = (99 - progresses[i]) / speeds[i] + 1;
            que.offer(day);
        }
        int first = que.poll();
        while(!que.isEmpty()){
            if(first >= que.peek()){
                que.poll();
                count++;
            }
            else { 
                list.add(count);
                count = 1;
                first = que.poll();
            }
        }
        list.add(count);
        // List<Integer> → int[] 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}