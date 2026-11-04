import java.util.*;

class Solution {
    public int solution(String[] board) {
        
        Queue<int[]> queue = new ArrayDeque<>();
        
        //세로
        int h = board.length;
        int w = board[0].length();
        
        //방문했는지
        boolean[][] visited = new boolean[h][w];
        
        //방향
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        //출발 지점 찾기
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length(); j++) {
                if(board[i].charAt(j) == 'R') {
                    queue.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                    break;
                }
            }
        }
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            // 현재 좌표
            int cx = current[0];
            int cy = current[1];
            int count = current[2];
            
            if(board[cx].charAt(cy) == 'G') {
                return count; 
            }
            
            for(int i = 0; i < 4; i++) {
                
                int x = cx;
                int y = cy;
                
                while(true) {
                    //다음 좌표
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    
                    // 다음 칸이 범위 벗어나면 패스
                    if( nx < 0 || nx >= h || ny < 0 || ny >= w) {
                        break;
                    }
                    
                    // 다음 칸이 장애물이면 멈춤
                    if(board[nx].charAt(ny)== 'D') {
                        break;
                    }
                    
                    //이동할 수 있으면 현재 위치 갱신;
                    x = nx;
                    y = ny;
                }
                
                if(visited[x][y]) {
                    continue;
                }
                
                    queue.offer(new int[]{x, y, count + 1});
                    visited[x][y] = true;              
        
            }
        }
    
        return -1;
    }
}