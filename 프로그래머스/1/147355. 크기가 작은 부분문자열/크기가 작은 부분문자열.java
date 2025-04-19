class Solution {
    public int solution(String t, String p) {
        int answer = 0; // count로 취급
        int len = p.length();
        long pNum = Long.parseLong(p);// 숫자로 변환
        
        
        for(int i = 0; i<= t.length()-len; i++){
            String sub = t.substring(i, i+len);
            long subNum = Long.parseLong(sub);
        if(subNum <= pNum) answer++;
        }
        
        
        return answer;
    }
}