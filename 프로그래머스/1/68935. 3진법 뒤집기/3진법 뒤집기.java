import java.util.*;

class Solution {
    public double solution(int n) {
        double answer = 0.0;
        ArrayList<Integer> num = new ArrayList<>();
        Queue<Integer> a = new ArrayDeque<>();
        
        while ( n > 0) {
            a.add(n % 3);
            n = n / 3;
        }
        
        while(! a.isEmpty()) {
            num.add(a.poll());
        }
        
        for(int i = 0; i < num.size(); i++) {
            answer = answer + (Math.pow(3, num.size() - 1 - i) * num.get(i)); 
        }
        
        return answer;
    }
}