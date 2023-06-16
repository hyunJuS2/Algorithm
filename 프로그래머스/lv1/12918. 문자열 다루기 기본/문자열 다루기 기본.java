class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()== 4 || s.length()==6) {
            for (int i = 0; i < s.length(); i++) {
                int check = (int)(s.charAt(i));
                if (!(check > 47 && check < 58)) { // 0~9의 아스키코드 값 -> 48~57
                    return false;
                }
            }
        } else return false;
        return answer;
    }
}