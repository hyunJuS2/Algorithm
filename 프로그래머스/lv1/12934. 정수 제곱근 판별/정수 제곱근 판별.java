class Solution {
    public long solution(long n) {
        long answer = 0;
                if(Math.pow((int)Math.sqrt(n),2)==n){ // 다시 곱해도 n이 나오는지
            answer = (long)Math.pow((Math.sqrt(n) +1) ,2);
        } else answer =-1;
    
        return answer;
    }
}