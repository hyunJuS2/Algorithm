import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        char[] splits = my_string.toCharArray();
        for(char s : splits){
            if(s >= '0' && s <= '9'){
                list.add(s - '0');
            }
        }       
        list.sort(null);
        int [] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}