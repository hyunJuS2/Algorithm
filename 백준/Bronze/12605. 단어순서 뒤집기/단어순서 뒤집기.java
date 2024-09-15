// 띄워쓰기를 기준으로 .split()
// stack에 모두 push
// stack에서 pop

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        // 첫 번째 줄에서 N을 입력 받음
        int N = Integer.parseInt(br.readLine());
        
       // N개의 케이스 처리
        for (int i = 1; i <= N; i++) {
            // 각 케이스의 문자열을 입력 받음
            String line = br.readLine();
        
        // 스페이스로 단어를 분리
        String[] words = line.split(" ");
    
        // 스택 생성
        Stack<String> stack = new Stack<>();
        
        // 각 단어를 스택에 push
        for (String word : words) {
            stack.push(word);
        }
            
        // 출력 형식 "Case #x: "
        System.out.print("Case #" + i + ": ");

        // 스택에서 단어를 꺼내어 역순으로 출력
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
               System.out.print(" ");  // 스페이스 추가
            }
        }
        
        // 결과 출력
        System.out.println();
        }
    }
}