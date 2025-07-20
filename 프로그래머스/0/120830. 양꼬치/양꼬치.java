class Solution {
    public int solution(int n, int k) {
        
        int free = n / 10;
        int nofree = k - free;
        
        return n * 12000 + nofree *2000;
    }
}