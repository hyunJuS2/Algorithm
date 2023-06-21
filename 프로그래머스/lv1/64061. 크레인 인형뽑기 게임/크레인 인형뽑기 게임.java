import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int move : moves){ // moves의 길이만큼 크레인이 인형을 뽑고
             move = move -1; //move의 인덱스값 -1 이 board인덱스 값시작 (0부터 시작)과 동일해진다.
            for (int i = 0; i < board[0].length; i++) {
                if(board[i][move]!=0){ 
                    //move가 고정되고 i가 바뀌면서 값이 0이 아닐때 까지 찾으면 가장 위의 값이 나오게 됨.
                   if(!stack.isEmpty() && stack.peek() == board[i][move]){
                       board[i][move] = 0;
                       stack.pop();
                       answer+=2;

                   } else {
                       stack.push(board[i][move]);
                       board[i][move] = 0;
                   } break;
                }
            }
        }

        return answer;
    }
}