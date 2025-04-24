class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int num = arr.length%2;
        
        if(num != 0){
            for(int i = 0; i < arr.length; i = i+2){
                arr[i] += n;
            }
        }
        else{
            for(int j = 1; j < arr.length; j = j+2){
                arr[j] += n;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}