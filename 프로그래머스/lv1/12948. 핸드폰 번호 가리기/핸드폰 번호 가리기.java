class Solution {
    public String solution(String phone_number) {
        String answer = "";
           for (int i = 0; i < phone_number.length()-4; i++) {
           answer += "*"; // 0102333/3333 *******
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}