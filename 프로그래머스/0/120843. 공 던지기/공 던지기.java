/*
**주의 해야할 점**
1. % numbers.length를 한 나머지 인덱스의 값이 결과
2. 시작 인덱스가 0이라는 것 주의
3. k는 1부터 시작이기 때문에 k번 째 던지는 사람을 찾으려면 k-1
*/
class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0 + 2 * (k-1) % numbers.length;
        return numbers[index];
    }
}