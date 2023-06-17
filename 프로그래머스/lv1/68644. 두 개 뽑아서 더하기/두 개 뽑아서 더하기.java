import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] re = set.toArray(new Integer[0]);
        int [] answer = Arrays.stream(re).sorted().mapToInt(i->i).toArray(); //i -> i => 

        return answer;
    }
}