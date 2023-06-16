import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); // a b c(2) d e
        Arrays.sort(completion); // a b d(2) e

        for (int i = 0; i < completion.length; i++) {
            if(participant[i].equals(completion[i])){
                continue;
            }else{
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}