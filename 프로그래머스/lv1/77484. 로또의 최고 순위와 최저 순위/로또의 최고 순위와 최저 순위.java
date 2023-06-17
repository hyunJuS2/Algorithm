import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    
        int[] answer = {0,0};
        
        int minCount = 0;
        int maxCount = 0;

        for(int l : lottos){
            if(l==0) { maxCount++; }//0의 개수
            for(int w : win_nums){
                if(l==w){
                    minCount++; // 겹치는 수의 개수
                    break;
                }
            }
        }
    
        maxCount+= minCount; //
        
        answer[0] = (maxCount>1)? 7-maxCount : 6;
        answer[1] = (minCount>1)? 7-minCount : 6;
        
        return answer;
    }
}