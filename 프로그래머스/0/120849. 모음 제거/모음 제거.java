class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]","");
   
    }
}
// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         StringBuffer sb = new StringBuffer();
//         for(char c : my_string.toCharArray()){
//             if(c!= 'a' && c!= 'e' && c!= 'i' && c!='o'&& c!='u'){
//                 sb.append(c);
//             }
//         }
//         answer = sb.toString();

//         return answer;
//     }
// }