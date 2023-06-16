import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int lenth = 0; // answer배열의 길이를 구하기 위해 -> 나눠 떨어지는 개수가 즉 배열의 길이
        int index = 0; // answer배열에 나눠 떨어지는 값을 넣기 위한 index 값

        for (int num : arr) {
            if (num % divisor == 0) {
               lenth++;
            }
        }

        if (lenth == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[lenth];
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] % divisor == 0){
                answer[index] = arr[j]; //예 -> 10은 인덱스가 3 ->
                index++;
            }
        }
         Arrays.sort(answer);
       return answer;
    }
}