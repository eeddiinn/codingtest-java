import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int answer = 0;
        
        Queue<int[]> queue = new ArrayDeque<>();
        
        // 크기
        int h = maps.length;
        int w = maps[0].length();
        
        // 레버 자리 기억하기
        int lx = 0;
        int ly = 0;
        int ltime = 0;
        
        // 레버 찾앚나?
        boolean foundLever = false;
        
        boolean[][] visited = new boolean[h][w];
        
        // 상하좌우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // 시작점 먼저 찾기
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < maps[i].length(); j++) {
                if(maps[i].charAt(j) == 'S') {
                    queue.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
            }
        }
        
        while(!queue.isEmpty()) {
            // 현재 위치
            int[] current = queue.poll();
            
            // 현재 좌표
            int x = current[0];
            int y = current[1];
            int time = current[2];
            
            
            // 레버 찾으면 while 빠져나가기
            if(maps[x].charAt(y) == 'L') {
                lx = x;
                ly = y;
                ltime = time;
                foundLever = true;
                queue.clear();
                break;
            }
            
            for(int i = 0; i < 4; i++) {
                
                // 확인할 좌표
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 넘어가는지 여부
                if(nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    continue;
                }
                
                // 방문했는지 여부 
                if(visited[nx][ny]) {
                    continue;
                }

                
                // 갈 수 없는 길인지 여부
                if(maps[nx].charAt(ny) == 'X') {
                    continue;
                }
                
                queue.offer(new int[]{nx, ny, time + 1});
                visited[nx][ny] = true;
                }   
            }
        
        
        // 레버 못찾으면 
         if(!foundLever) {
                return -1;
            }
            
        
        // 레버 이후 새롭게 시작
            boolean[][] visited2 = new boolean[h][w];
        
            queue.offer(new int[]{lx, ly, ltime});
        visited2[lx][ly] = true;
            
            while(!queue.isEmpty()) {
            // 현재 위치
            int[] current = queue.poll();
            
            // 현재 좌표
            int x = current[0];
            int y = current[1];
            int time = current[2];
            
            
            // 출구 찾으면 return
            if(maps[x].charAt(y) == 'E') {
                return time;
            }
            
            for(int i = 0; i < 4; i++) {
                
                // 확인할 좌표
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 넘어가는지 여부
                if(nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    continue;
                }
                
                // 방문했는지 여부 
                if(visited2[nx][ny]) {
                    continue;
                }

                // 갈 수 없는 길인지 여부
                if(maps[nx].charAt(ny) == 'X') {
                    continue;
                }
                
                queue.offer(new int[]{nx, ny, time + 1});
                visited2[nx][ny] = true;
                }   
            }
        
        return -1;
        }
    }