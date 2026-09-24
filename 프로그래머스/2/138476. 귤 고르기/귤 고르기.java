import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++) {
            if(map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
            else {
                map.put(tangerine[i], 1);
            }
        }
        
        ArrayList<Integer> a = new ArrayList<>(map.values());
        
        a.sort(Collections.reverseOrder());
        
        int count = 0;
        
        for(int i = 0; i < a.size(); i++) {
            count = count + a.get(i);
            answer ++;
            
            if(count >= k){
                break;
            }
        }
        return answer;
    }
}