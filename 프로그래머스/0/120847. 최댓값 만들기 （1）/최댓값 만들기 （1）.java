import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 정렬 후 맨 만지막 2개 곱하기
        Arrays.sort(numbers);
    
        return numbers[numbers.length-1] * numbers[numbers.length-2] ;
    }
}