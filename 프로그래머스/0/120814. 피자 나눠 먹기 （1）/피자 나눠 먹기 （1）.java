// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         answer = n / 7;
//         if(n%7 != 0)
//             answer++;
//         return answer;
//     }
// }

//n명이서 7조각인 피자를 한 개 이상 먹으려면 몇 판이 필요할까?
class Solution{
    public int solution(int n){
        int answer = n / 7;
        if (n % 7 != 0) answer++; 
        return answer;
    }
}