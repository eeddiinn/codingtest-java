import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
            else {
                map.put(tangerine[i], 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        
        list.sort(Collections.reverseOrder());
        
        int count = 0;
        
        for(int i = 0; i < list.size(); i++) {
            count = count + list.get(i);
            answer++;
            
            if( count >= k) {
                break;
            }
        }
        
        return answer;
    }
}