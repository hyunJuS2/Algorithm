import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0; 
        Arrays.sort(wallet); // 앞에 값이 작은 값
        Arrays.sort(bill);
            
        while(bill[0] > wallet[0] || bill[1] > wallet[1]){ 
            // bill의 큰 부분을 반 접어야 함.
            bill[1] = bill[1]/2;
            answer ++;
            Arrays.sort(wallet); // 앞에 값이 작은 값
            Arrays.sort(bill);
        }
        return answer;
    }
}