/* stack을 잘 안쓴다는 것을 알았으니, deque로 구현해보자!
풀이 방법 1.
1. deque에 괄호를 넣는데 
- deque가 비었을 경우, 같을 경우 push
2. 모양이 다르면 pop
3. 남아 있은 deque의 길이가 0이 아니라면 false

*/

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque <Character> que = new ArrayDeque<>();
        
        for(char b : s.toCharArray()){
            if(b == '('){
                que.push(b);
            } else {
                if(que.isEmpty()) return false;
                que.pop();
            }
        }
        
        answer = que.isEmpty();
        return answer;
    }
}