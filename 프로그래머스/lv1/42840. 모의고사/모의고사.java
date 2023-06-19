import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
                int[] count = new int[]{0,0,0}; // 각 사람의 정답 횟수 배열
         int[] human1 = new int[]{1, 2, 3, 4, 5}; //5 human1.length
         int[] human2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};//8 human2.length
         int[] human3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};//10 human3.length

         // 0번째 % 5-> 1(0), 1번째 -> 2(1), 2번째 -> 3, 3번째 -> 4, 4번째-> 5,
         //5번째 % 5-> 1(0), 6번째 -> 2(1)

         // 정답 개수를 찾는 부분
         int[][] human = {human1, human2, human3}; //이차원 배열 만들기
         int j = 0;
         for(int[] hNum : human){
             for (int i= 0; i < answers.length; i++) { //
                 if(hNum[i % human[j].length] == answers[i]) {
                     count[j]++;
                 }
             }
             j++;
         }

         // max값의 인덱스 찾기
         ArrayList <Integer> ls = new ArrayList<>();


         // max값 찾기
         int max = 0;
         for (int i = 0; i < count.length; i++) {
             if(max < count[i]){
                 max = count[i];
             }
         }


         // max값 인덱스찾기
         for (int i = 0; i < count.length; i++) {
             if(max == count[i]){
                 ls.add(i+1);
             }
         }


         // ArrayList에서 배열 변환
         int[] answer = new int[ls.size()];
         for (int i = 0; i < answer.length; i++) {
             answer[i] = ls.get(i);
         }
        return answer;
    }
}