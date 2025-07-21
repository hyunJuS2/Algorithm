class Solution {
    public int solution(int n) {
        int i = 0;
        while(true){
            if(factorial(++i) > n) break;
        } 
        return i - 1;
    }
    
    int factorial (int f){
        if(f == 0 || f == 1) return 1;
        return f * factorial(f-1);
    }
}