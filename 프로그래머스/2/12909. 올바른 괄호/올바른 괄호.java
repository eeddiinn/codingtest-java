import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        if (s.charAt(0) == ')') {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            }
            else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        
        if(!stack.isEmpty()) {
            return false;
        }
        
        return answer;

    }
}