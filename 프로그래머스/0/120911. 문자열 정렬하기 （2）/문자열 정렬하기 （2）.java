import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        my_string = my_string.toLowerCase();
        char[] chars = my_string.toCharArray();
        Arrays.sort(chars);
        for(char ch : chars){
         sb.append(String.valueOf(ch));   
        }
        return sb.toString();
    }
}