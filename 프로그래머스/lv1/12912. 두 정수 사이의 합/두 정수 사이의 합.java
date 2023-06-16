class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){
            for(int i = a; i <= b; i++){
                answer += i;
            }
        }
        //     a >= b일 경우
        else{
            for(int i = b; i <= a; i++)
                answer += i;
        }
        return answer;
    }
}