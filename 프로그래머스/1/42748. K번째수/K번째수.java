import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for(int n = 0; n < commands.length; n++){
            int i = commands[n][0] -1;
            int j = commands[n][1];
            int k = commands[n][2]-1;
        
            int [] subArray = Arrays.copyOfRange(array, i, j);
            Arrays.sort(subArray);
            answer[n] = subArray[k];
        }
        return answer;
    }
}