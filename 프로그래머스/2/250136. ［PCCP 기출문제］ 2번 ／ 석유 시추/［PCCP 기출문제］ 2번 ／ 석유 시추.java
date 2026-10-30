
import java.util.*;

class Solution {
    public int solution(int[][] land) {

        int n = land.length;
        int m = land[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        int[] sum = new int[m]; // 각 열에서 얻을 수 있는 총 석유량

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (land[i][j] == 0 || visited[i][j]) {
                    continue;
                }

                int count = 0; // 현재 석유 덩어리의 크기
                boolean[] columns = new boolean[m]; // 석유 덩어리가 걸쳐 있는 열

                queue.offer(new int[]{i, j});
                visited[i][j] = true;

                while (!queue.isEmpty()) {

                    int[] current = queue.poll();

                    int cx = current[0];
                    int cy = current[1];

                    count++;
                    columns[cy] = true; // 현재 석유가 있는 열 표시

                    for (int c = 0; c < 4; c++) {

                        int a = cx + dx[c];
                        int b = cy + dy[c];

                        if (a < 0 || a >= n || b < 0 || b >= m) {
                            continue;
                        }

                        if (land[a][b] == 0 || visited[a][b]) {
                            continue;
                        }

                        queue.offer(new int[]{a, b});
                        visited[a][b] = true;
                    }
                }

                // 연결된 석유 덩어리 전체 크기를 해당 열들에 더하기
                for (int k = 0; k < m; k++) {
                    if (columns[k]) {
                        sum[k] += count;
                    }
                }
            }
        }

        // 각 열의 석유량 중 최댓값 찾기
        int answer = sum[0];

        for (int i = 1; i < m; i++) {
            if (sum[i] > answer) {
                answer = sum[i];
            }
        }

        return answer;
    }
}
