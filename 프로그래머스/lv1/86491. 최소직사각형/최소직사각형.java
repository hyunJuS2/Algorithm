class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        for (int[] num : sizes) { // 세로 > 가로  가로에 세로값을 대입하기
            if(num[0] < num[1]){
                int temp;
                temp = num[0]; // temp = 30
                num[0] = num[1]; //num[0] = 70
                num[1] = temp; // num[1] = 30
            }
        }
        int max_w = sizes[0][0];
        int max_h = sizes[0][1];

        for (int i = 0; i < sizes.length; i++) {
            if (max_w < sizes[i][0]) {
                max_w = sizes[i][0];
            }
            if (max_h < sizes[i][1]){
                max_h = sizes[i][1];
            }
        }
         answer= max_w * max_h;
        return answer;
    }
}