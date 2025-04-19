class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n+1][m+1];
        int MOD = 1000000007;
        
        // 물에 잠긴 지역
        for(int[]puddle : puddles){
            int x = puddle[0];
            int y = puddle[1];
            dp[y][x] = -1;
        }
        
        dp[1][1] = 1;//시작위치
        
        for(int y =1; y <= n; y++){
            for(int x=1; x<=m; x++){
                if(x==1 && y ==1) continue; //시작점 생략
                if(dp[y][x] == -1){
                    dp[y][x] = 0;
                } else {
                    int fromLeft = dp[y][x-1];
                    int fromTop = dp[y-1][x];
                    dp[y][x] =(fromLeft+fromTop) %MOD;
                }
            }
        }
        
        return dp[n][m];
    }
}