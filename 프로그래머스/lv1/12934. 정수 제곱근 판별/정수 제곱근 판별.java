class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n); //->.0

        if(result == (int)result){
            answer = (long)(Math.pow(result + 1,2));
        }else{
            answer = -1;
        }
        return answer;
    }
}