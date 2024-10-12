class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder touchs = new StringBuilder();
        int left = 10; // 왼손 위치 *을 10으로
        int right = 12; // 오른손 위치 #을 12로
        for(int n:numbers){
        // 숫자가 1,4,7 일 경우 왼손
            if(n==1 || n==4 || n==7) {
                touchs.append("L");
                left = n;
            }
        // 숫자가 3,6,9 일 경우 오른손
            else if(n==3 || n==6 || n==9){
                touchs.append("R");
                right = n;
            }
        // 숫자가 2,8,5,0 일 경우 더 가까운 손으로 - 크기가 작아야 더 가까움
            else {
                if(n==0) n=11;

                int left_D = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;
                int right_D = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;
                
                if(left_D > right_D){
                    touchs.append("R");
                    right = n;
                }
                else if(left_D < right_D){
                    touchs.append("L");
                    left = n;
                }
                else{//거리가 같을 경우
                    if(hand.equals("left")) {
                        touchs.append("L");
                        left = n;
                    }
                    else{
                        touchs.append("R");
                        right = n;
                    }
                }
            
            }
        }
        String answer = touchs.toString();
        return answer;
    }
}