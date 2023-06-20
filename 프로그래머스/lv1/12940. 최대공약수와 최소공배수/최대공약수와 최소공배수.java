class Solution {
        public static int[] solution(int n, int m) {
        int[] answer = {0,0};
        //최대 공약수
        int gcd = gcd(n,m);
        //최대 공배수
        int mul = (n * m) / gcd;
        answer = new int[]{gcd, mul};
        return answer;
    }

    private static int gcd(int n, int m) { //유클리드 호제법
        if(m==0) return n;
        else return gcd(m, n % m);
    }

}