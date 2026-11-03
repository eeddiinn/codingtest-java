class Solution {
    public int[] solution(String[] park, String[] routes) {

        int h = park.length;
        int w = park[0].length();

        int[] now = new int[2];

        // 1. 시작 위치 찾기
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    now[0] = i;
                    now[1] = j;
                }
            }
        }

        // 2. 명령 하나씩 실행
        for (int i = 0; i < routes.length; i++) {

            char where = routes[i].charAt(0);
            int number = routes[i].charAt(2) - '0';

            int dx = 0;
            int dy = 0;

            // 방향 설정
            if (where == 'E') {
                dy = 1;
            } else if (where == 'W') {
                dy = -1;
            } else if (where == 'S') {
                dx = 1;
            } else if (where == 'N') {
                dx = -1;
            }

            // 3. 이동할 위치를 임시로 저장
            int nx = now[0];
            int ny = now[1];

            boolean possible = true;

            // 4. 한 칸씩 이동하면서 검사
            for (int j = 0; j < number; j++) {

                nx += dx;
                ny += dy;

                // 공원 밖이면 이동 취소
                if (nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    possible = false;
                    break;
                }

                // 장애물이 있으면 이동 취소
                if (park[nx].charAt(ny) == 'X') {
                    possible = false;
                    break;
                }
            }

            // 5. 모든 칸을 통과했을 때만 실제 이동
            if (possible) {
                now[0] = nx;
                now[1] = ny;
            }
        }

        return now;
    }
}