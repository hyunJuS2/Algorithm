import java.util.ArrayList;
class Solution {
 
    public static boolean[] prime = new boolean[3001];
    public static void get_prime(){
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public static int solution(int[] nums){
        ArrayList<Integer> sum_a = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 >= nums.length) break;
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    sum_a.add(sum);
                }
            }
        }

        int answer = 0;
        get_prime();

        for (Integer num : sum_a) {
            if (!prime[num]) answer++;
        }
        return answer;
    }
}