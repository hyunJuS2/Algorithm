class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[A-Za-z]", " ");
        String [] str = my_string.trim().split("\\s+"); 
        for(String s : str){
             if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}