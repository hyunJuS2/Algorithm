class Solution {
    public String solution(String s) {
        
        String answer = "";
        int index = 0;
        String[] str = s.split("");
        for (int i = 0; i <str.length ; i++) {
            if(str[i].equals(" ")){
                index = 1;
            }
            answer += (index%2==0)? str[i].toUpperCase() : str[i].toLowerCase(); //" "
            index++;
        }
        return answer;
    } 
}