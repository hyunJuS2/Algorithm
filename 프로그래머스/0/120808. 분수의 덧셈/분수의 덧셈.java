class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = denom1 * numer2 + denom2 * numer1;
        int denom3 = denom1 * denom2; 
        
        int gcd = getGCD(numer3, denom3);
        
        numer3 /= gcd;
        denom3 /= gcd;
        
        answer[0] = numer3;
        answer[1] = denom3;
        
        return answer;
    }
    
    int getGCD(int a, int b){
        
        while(b!= 0){
            int temp = a % b;
             a = b;
             b = temp;
        }
        return a;
    }
}