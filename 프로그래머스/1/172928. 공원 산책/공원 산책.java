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

        // 2. 방향 배열
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        String dirs = "EWSN";

        // 3. 경로 하나씩 확인
        for (int i = 0; i < routes.length; i++) {

            char where = routes[i].charAt(0);
            int number = routes[i].charAt(2) - '0';

            int dir = dirs.indexOf(where);

            int nx = now[0];
            int ny = now[1];

            boolean possible = true;

            // 4. 한 칸씩 이동하면서 검사
            for (int j = 0; j < number; j++) {

                nx += dx[dir];
                ny += dy[dir];

                if (nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    possible = false;
                    break;
                }

                if (park[nx].charAt(ny) == 'X') {
                    possible = false;
                    break;
                }
            }

            // 5. 이동 가능하면 현재 위치 변경
            if (possible) {
                now[0] = nx;
                now[1] = ny;
            }
        }

        return now;
    }
}