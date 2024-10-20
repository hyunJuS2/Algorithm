import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rows = park.length; // 행 수
        int cols = park[0].length; // 열 수

        Arrays.sort(mats);
        for (int x = 0; x < rows; x++) { // x는 행
            for (int y = 0; y < cols; y++) { // y는 열
                if (park[x][y].equals("-1")) { // 시작할 매트 지점
                    int maxMatsSize = getMatsMax(mats, park, x, y);
                    answer = Math.max(answer, maxMatsSize); // 둘 중 큰 값을 answer에 대입
                    
                    // 만약 가장 큰 게 나왔다면 더 이상 공원을 돌지 않고 종료
                    if (answer == mats[mats.length - 1]) return answer;
                }
            }
        }
        return answer;
    }

    public int getMatsMax(int[] mats, String[][] park, int x, int y) {
        int maxSize = -1; // 기본값 설정
        int cols = park[0].length; // 열 수
        int rows = park.length; // 행 수

        // 가장 큰 매트부터 검사
        for (int i = mats.length - 1; i >= 0; i--) { // i >= 0으로 수정
            int size = mats[i];

            // 현재 좌표 x,y에서 매트의 길이를 더했을 때 공원을 벗어나면 false
            if (x + size - 1 >= rows || y + size - 1 >= cols) {
                continue; // 다음 작은 매트로
            }

            boolean canPlace = true; // 매트를 놓을 수 있는지 여부

            // 공원에 놓을 매트 공간 -1이 하나라도 없으면 불가능
            for (int n = x; n < x + size; n++) {
                for (int m = y; m < y + size; m++) {
                    if (!park[n][m].equals("-1")) {
                        canPlace = false;
                        break; // 내부 루프 종료
                    }
                }
                //if (!canPlace) break; // 매트를 놓을 수 없는 경우 외부 루프도 종료
            }

            // 매트를 놓을 수 있는 경우
            if (canPlace) {
                maxSize = size; // 최대 크기를 설정
                break; // 더 큰 매트를 찾기 위해 종료
            }
        }
        return maxSize; // 최대 크기 반환
    }
}
