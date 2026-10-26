import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[y + 1];
        
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        while(!queue.isEmpty()) {
            
            int[] current = queue.poll();
            
            int num = current[0];
            int count = current[1];
            
            // 같은 수 찾으면
            if(num == y) {
                return count;
            }
            
            int[] nextNums = {num + n, num * 2, num * 3};
            
            for(int i = 0; i < 3; i ++) {
                
                if(nextNums[i] > y || visited[nextNums[i]]) {
                    continue;
                }
                
                queue.offer(new int[]{nextNums[i], count + 1});
                visited[nextNums[i]] = true;
            }
        }
        
        return -1;
        }
    
    }