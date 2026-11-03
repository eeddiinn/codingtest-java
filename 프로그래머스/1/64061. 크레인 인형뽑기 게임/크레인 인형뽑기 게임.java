import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int h = board.length;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
            
            int location = moves[i] - 1;
            
            for(int j = 0; j < h; j++) {
                
                // 없으면 넘어가기
                if(board[j][location] == 0) {
                    continue;
                }
                else {
                    if(!stack.isEmpty() && stack.peek() == board[j][location]) {
                        stack.pop();
                        answer += 2;
                        board[j][location] = 0;
                        break;
                    }
                    else {
                        stack.push(board[j][location]);
                        board[j][location] = 0;
                        break;   
                    }
                }
            }
        }
        
        
        return answer;
    }
}