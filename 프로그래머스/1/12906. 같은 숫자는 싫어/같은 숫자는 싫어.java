/* 풀이 방법 1.
1. 스택에 값을 넣음 
- 비어있지 않는경우 ppek 후 현재와 비교, 
- 같으면 값을 기존의 값을 pop 후 push,
- 다르면 그대로 push]

   풀이 방법 2.
1. Stack 대신 Dequeue를 사용해 보자 (실전에서는 stack을 잘 사용하지 않음)

*/
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.isEmpty() || stack.peek() != i) {stack.push(i);}
        }
        // stack -> List 로 복사(순서 유지)
        List<Integer> list = new ArrayList<>(stack);
        // List -> int[]
        answer = new int[list.size()];
        for(int j = 0; j <list.size(); j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}