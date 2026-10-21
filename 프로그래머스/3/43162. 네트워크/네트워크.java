import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        
        for(int start = 0; start < n; start++) {
            
            if(!visited[start]) {
                
                answer ++;
                
                stack.push(start); 
                visited[start] = true;
                
                while(!stack.isEmpty()) {
                    int now = stack.pop(); // 0번부터 시작
                    
                    for(int i = 0; i < n; i++) {
                        if(computers[now][i] == 1 && !visited[i]) {
                            stack.push(i);
                            visited[i] = true;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}
