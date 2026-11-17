import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        int n = elements.length; // 수의 개수
        
        // 중복되지 않게 수 저장
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= n; i++) { // 몇개씩인지
            
            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                
                for(int k = j; k < j + i ; k++) {
                    sum += elements[k % n];
                }
                 set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}