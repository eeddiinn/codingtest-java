import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> a = new ArrayList<>();
        
        int length = String.valueOf(n).length();
        
        while (n>0) {
            a.add(n % 10);
            n /= 10;
        }
        
        a.sort(Collections.reverseOrder());
        
        for (int i=0; i < a.size(); i++) {
            answer = a.get(i) + (answer * 10);
        }
        
        return answer;
    }
}