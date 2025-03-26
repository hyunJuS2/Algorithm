/* 풀이 방법 1.
1. 정렬을 이용해서 1 - 12 - 123 앞의 숫자가 작은 순서대로 정렬(String)하기 -> 문자열이기에 가능
2. 정렬 했을 경우 앞의 값이 뒤에 값에 포함되어있으면 접두어 ok(false), 아니면 no(true)

   풀이 방법 2.
1. HashSet을 이용해서 첫번째값을 가지고 다음 값을에 sustring 후 Contain 포함되어 있는지 확인하기
*/
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
           if(phone_book[i + 1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}