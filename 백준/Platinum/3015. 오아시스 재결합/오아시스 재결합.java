import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());  // 사람의 수
        Stack<int[]> stack = new Stack<>();       // 키와 같은 키의 등장 횟수를 저장하는 스택
        long count = 0;                           // 볼 수 있는 쌍의 수
        
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(br.readLine());  // 현재 사람의 키
            int sameHeightCount = 1;  // 현재 키와 같은 키의 등장 횟수 (기본값은 1)
            
            // 스택에 있는 사람 중 현재 사람보다 키가 작은 사람은 볼 수 없으므로 제거
            // 왜냐? 현재 사람보다 키가 작은 사람이 이미 현재사람을 봤기 때문에
            // 키가 작은 사람을 볼 수 있다고 허용하게 되면 두번 보는 것으로 중복이 되어버림 그렇기에 제거!
            while (!stack.isEmpty() && stack.peek()[0] < height) {
                count += stack.pop()[1];  // 스택에서 제거된 사람들과 현재 사람은 서로 볼 수 있음
            }
            
            // 스택에 있는 사람이 현재 사람과 같은 키일 때
            if (!stack.isEmpty() && stack.peek()[0] == height) {
                int[] top = stack.pop();
                sameHeightCount = top[1] + 1;  // 같은 키의 사람 수를 증가시킴
                count += top[1];  // 같은 키의 사람들끼리는 서로 볼 수 있음
            }
            
            // 스택이 비어있지 않으면, 스택의 맨 위에 있는 사람과 현재 사람은 서로 볼 수 있음
            if (!stack.isEmpty()) {
                count++;
            }
            
            // 현재 사람의 키와 같은 키의 등장 횟수를 스택에 추가
            stack.push(new int[]{height, sameHeightCount});
        }
        
        // 결과 출력
        System.out.println(count);
    }
}
