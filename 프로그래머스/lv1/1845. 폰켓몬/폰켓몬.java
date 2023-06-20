
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
         int answer = 0;
        int value = nums.length/2;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        answer = (set.size() > value) ?  value : set.size();
        return answer;
    }
}