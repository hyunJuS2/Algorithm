class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0; // 내야할 가격
        for(int i = 0; i <= count; i++){
            sum += i * price;
        }
        if(sum > money)
            answer = sum-money;
        else answer = 0;
        return answer;
    }
}