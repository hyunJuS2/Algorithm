        
        // 1. charAt으로 문자열 뽑기
        // 2. same == diff 일때 둘다 0으로 초기화하고 첫문자열도 새롭게 하기
        // 3. 남은 숫자도 count 하기

class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int diff = 0;
        char x = s.charAt(0);
        
        for(int i = 0; i<s.length(); i++){
            if(same ==0 && diff ==0){
                x = s.charAt(i);
            }
            
            if(s.charAt(i) == x){
                same++;
            }
            else{
                diff++;
            }
            
            if(same == diff){
                answer++;
                same = 0;
                diff = 0;
            }
            
        }
        if(same !=0 || diff!=0){
                answer++;
            }

        return answer;
    }
}