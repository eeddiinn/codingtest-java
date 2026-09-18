import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> a = new Stack<>();
        a.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(a.isEmpty()) {
                a.push(s.charAt(i));
            }
            else {
                if(a.peek() == s.charAt(i)){
                    if(! a.isEmpty()) {
                        a.pop();
                    }
                }
                else {
                    a.push(s.charAt(i));
                }
            }   
        }
        
        if(a.isEmpty()) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}
