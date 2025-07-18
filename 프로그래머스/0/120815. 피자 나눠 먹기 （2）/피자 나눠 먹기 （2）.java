// 6과 n의 최소 공배수 -> 두 수의 곱 후 최대 공약수로 나누기!
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int gcd = getGcd(6, n);
        int LCM = n*6 / gcd;
        answer = LCM / 6;
        
        return answer;
    }
    
    public int getGcd(int a, int b){
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
}