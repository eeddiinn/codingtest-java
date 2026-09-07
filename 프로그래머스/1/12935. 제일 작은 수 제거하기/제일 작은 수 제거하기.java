import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
            b.add(arr[i]);
        }
        
        a.sort(null);
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == a.get(0)) {
                b.remove(i);
            }
        }
    
        if(b.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[b.size()];
            for(int i = 0; i < b.size(); i++) {
                answer[i] = b.get(i);
            }
        }
        
        return answer;
    }
}