class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countp = 0;
        int county = 0;
        s = s.toLowerCase(); // 대문 -> 소문   // toUpperCase() -> 소문자를 대문자로
        String[] ans = s.split("");
        for (int i = 0; i < s.length() ; i++) {
            if(ans[i].equals("p")){
               countp ++;
            } else if (ans[i].equals("y")) {
                county++;
            }
            if (county == countp) {
                answer = true;
            } else if (county == 0 && countp == 0) {
                answer = true;
            } else answer = false;

        }
        return answer;
    }
}