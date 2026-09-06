import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a.add(arr[i]);
            }
        }
        
        if(a.isEmpty()) {
            answer = new int[1]; // 꼭 길이 선언하고 해야함
            
            answer[0] = -1;
        }
        else {
            answer = new int[a.size()];
            
            a.sort(null); // 오름차순 정렬 
            
            for(int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
            }
        }
      
        return answer;
    
    }
}