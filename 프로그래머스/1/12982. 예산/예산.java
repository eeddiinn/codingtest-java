import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 0; i < d.length; i++) {
            a.add(d[i]);
        }
        
        a.sort(null);
        
        for(int i = 0; i < a.size(); i++) {
            if (budget - a.get(i) >= 0) {
               budget = budget - a.get(i);
                answer++;
            }
        }
        
        return answer;
    }
}