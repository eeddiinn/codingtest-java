import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        
        boolean[][] visited = new boolean[n][m];
        int[][] distance = new int[n][m];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        distance[0][0] = 1;
        
        while(!queue.isEmpty()) {
            
            int[] cur = queue.poll();
            
            int x = cur[0];
            int y = cur[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                
                if( maps[nx][ny] == 0) {
                    continue;
                }
                
                if(visited[nx][ny]) {
                    continue;
                }
                
                visited[nx][ny] = true;
                distance[nx][ny] = distance[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }  
        
        if(distance[n - 1][m -1 ] == 0) {
                return -1;
        }
        
        return distance[n-1][m-1];
        
    }
}
  