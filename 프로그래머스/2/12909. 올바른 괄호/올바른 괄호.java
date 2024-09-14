import java.util.Stack;

class Solution {
    boolean solution(String s) {
        // stack 선언
        Stack<Character> stack = new Stack<>();
        //String s의 길이 만큼 for문.
        for(int i = 0; i<s.length(); i++) {
            // 스택이 비어있지 않으면서, i번째 문자가 ')'면 담지 않고 바로 스택.pop
            if(!stack.empty() && s.charAt(i) == ')') {
                stack.pop();
            }
            // '('는 스택에 담기
            else stack.push(s.charAt(i));
        }

        return stack.empty();
    }
}