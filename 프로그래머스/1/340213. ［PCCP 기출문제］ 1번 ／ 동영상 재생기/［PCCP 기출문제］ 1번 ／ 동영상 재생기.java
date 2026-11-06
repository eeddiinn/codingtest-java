import java.util.*;

class Solution {
    public String solution(String video_len, String pos,
                           String op_start, String op_end,
                           String[] commands) {

        String[] v = video_len.split(":");
        String[] p = pos.split(":");
        String[] os = op_start.split(":");
        String[] oe = op_end.split(":");

        // 모든 시간을 초로 변환
        int video = Integer.parseInt(v[0]) * 60
                  + Integer.parseInt(v[1]);

        int current = Integer.parseInt(p[0]) * 60
                    + Integer.parseInt(p[1]);

        int start = Integer.parseInt(os[0]) * 60
                  + Integer.parseInt(os[1]);

        int end = Integer.parseInt(oe[0]) * 60
                + Integer.parseInt(oe[1]);

        for (int i = 0; i < commands.length; i++) {

            // 1. 명령어 실행 전 오프닝 확인
            if (current >= start && current <= end) {
                current = end;
            }

            // 2. prev 또는 next 실행
            if (commands[i].equals("prev")) {
                current = Math.max(0, current - 10);
            } else {
                current = Math.min(video, current + 10);
            }

            // 3. 명령어 실행 후 오프닝 확인
            if (current >= start && current <= end) {
                current = end;
            }
        }

        // 초를 다시 mm:ss 형식으로 변환
        int mm = current / 60;
        int ss = current % 60;

        return String.format("%02d:%02d", mm, ss);
    }
}