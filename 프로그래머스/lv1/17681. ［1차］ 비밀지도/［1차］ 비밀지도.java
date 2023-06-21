class Solution {
     public static String zeroplus(int n, String bin) {
        //만약 2진수 변환 길이 크기가 n과 같지 않고 작을경우 맨 앞에 0을 추가 해줘야 함.
        if (bin.length() != n) {
            String zero = "";
            for (int j = 0; j < n - bin.length(); j++) {
                zero += "0";
                
            }bin = zero + bin;
        }
        return bin;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] arr = new int[n];
        String[] binary = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i] | arr2[i]; //or연산
            binary[i] = Integer.toBinaryString(arr[i]);

            //만약 2진수 변환 길이 크기가 n과 같지 않고 작을경우 맨 앞에 0을 추가 해줘야 함.
            answer[i] = zeroplus(n, binary[i]).replaceAll("0"," ").replaceAll("1","#");
        
    }
        return answer;
    }
}