class Solution {
    public String solution(String s) {
        String answer = "";
//        String[] str = s.split("");

//        if(str.length % 2 == 0){
//            answer += str[str.length/2 - 1];
//            answer += str[str.length/2];
//            answer += s.substring(s.length()/2 -1, 2);
//        }else{
//            answer += str[str.length/2];
//            answer += s.substring(s.length()/2, 1);
//        }
        
        if(s.length() % 2 == 0){
            answer = s.substring((s.length()/2) - 1, s.length()/2 + 1);
        }else{
            answer = s.substring(s.length()/2, s.length()/2 + 1);
        }
        return answer;
    }
}