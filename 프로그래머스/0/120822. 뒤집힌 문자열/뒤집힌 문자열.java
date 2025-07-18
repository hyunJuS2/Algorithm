// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
        
//         char[] re = my_string.toCharArray();
//         for(int i = my_string.length()-1; i>=0; i--)
//         {
//             answer += re[i];
//         }

//         return answer;
//     }
// }

class Solution{
    public String solution(String my_string){
        String answer ="";
        int len = my_string.length();
        
        for(int i = len-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}