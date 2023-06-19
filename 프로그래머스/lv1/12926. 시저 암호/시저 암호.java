class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] big = new char[26];
        char[] small = new char[26];

        // 알파벳 배열 만들기
        for(int i=0;i<big.length;i++)
        {
            big[i] = (char)(65 + i);
            small[i] = (char) (97 + i);
        }

        int sum_idx = -1;

        // s의 각 자리 문자를 시저 암호로 바꾸는 코드
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                // big에서 인덱스를 찾고 "AB"
                int big_idx = (int)s.charAt(i) - 65;
                // 인덱스에서 n을 더해주고
                sum_idx = big_idx + n;
                // 그 더한 인덱스의 값이 답
                if(sum_idx < 26)
                    answer += (char)(65 + sum_idx);
                else answer += (char)(65 + (sum_idx - 26));
                // abcdefghijklmnopqrstuvwxy(24)z 24 + 4 = 28
                // c (2) 28 - 26 = 2
            }
            else if(Character.isLowerCase(s.charAt(i))){
                int small_idx = (int)s.charAt(i) - 97;
                sum_idx = small_idx + n;
                if(sum_idx < 26)
                    answer += (char)(97 + sum_idx);
                else answer += (char)(97 + (sum_idx - 26));
            }else{
                answer += " ";
            }
        }
        return answer;
    }
}