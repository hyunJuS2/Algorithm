class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int value = x;
        int sum = 0;
        while(x>0){
            sum += x % 10;
            x = x/10;
        }
        if(value % sum == 0){
            answer = true;
        }
        return answer;
    }
}