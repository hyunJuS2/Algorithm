class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int[] opStartTime = parseTime(op_start);
        int[] opEndTime = parseTime(op_end);
        int[] posTime = parseTime(pos);
        int[] videoTime = parseTime(video_len);
        
        // 명령어 실행 전 op_start와 op_end 사이에 있는지 확인
        if (isInRange(posTime, opStartTime, opEndTime)) {
            posTime = opEndTime; // op_end로 이동
        }

        for (String cm : commands) {
            if (cm.equals("prev")) {
                posTime = checkTime(posTime, -10, videoTime);
            } else if (cm.equals("next")) {
                posTime = checkTime(posTime, 10, videoTime);
            }

            // op_start와 op_end 사이에 있는지 다시 확인
            if (isInRange(posTime, opStartTime, opEndTime)) {
                posTime = opEndTime; // op_end로 이동
            }
        }

        // 최종 시간을 문자열로 변환하여 반환
        answer = String.format("%02d:%02d", posTime[0], posTime[1]);
        return answer;
    }
    
    // 시간 조절 함수
    public int[] checkTime(int[] posTime, int jumpTime, int[] videoTime) {
        int minutes = posTime[0];
        int seconds = posTime[1];

        // 초 조정
        seconds += jumpTime;

        // 음수일 경우
        if (seconds < 0) {
            minutes -= 1; // 1분 빼고
            seconds += 60;
        }

        // 분이 음수가 될 경우
        if (minutes < 0) {
            minutes = 0; // 최소 0으로 설정
            seconds = 0; // 초도 0으로 설정         
        }

        // 초가 60 이상일 경우
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        // 마지막 위치와 비교
        if (minutes > videoTime[0] || (minutes == videoTime[0] && seconds > videoTime[1])) {
            return videoTime; // 마지막 위치로 설정
        }
        
        // 조정된 시간을 int 배열로 반환
        return new int[] { minutes, seconds };
    }
    
    // 시간을 "mm:ss" 형식에서 int 배열로 변환
    private int[] parseTime(String time) {
        String[] parts = time.split(":");
        return new int[] { Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) };
    }

    // 현재 시간이 op_start와 op_end 사이에 있는지 확인
    private boolean isInRange(int[] currentTime, int[] startTime, int[] endTime) {
        // 현재 시간이 범위 내에 있는지 비교
        return (currentTime[0] > startTime[0] || 
               (currentTime[0] == startTime[0] && currentTime[1] >= startTime[1])) &&
               (currentTime[0] < endTime[0] || 
               (currentTime[0] == endTime[0] && currentTime[1] < endTime[1]));
        
    }
}
