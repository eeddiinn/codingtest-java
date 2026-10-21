import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        HashSet<String> list = new HashSet<>();
        list.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            
            String last = words[i - 1];
            String now = words[i];
            
            int order = (i % n) + 1;
            
            if(list.contains(now) || 
                last.charAt(last.length() - 1) != now.charAt(0)) { 
                // 단어 중복이거나 앞단어랑 안맞으면 그 사람 Return;
                answer[0] = order;
                answer[1] = (i / n) + 1;
                
                return answer;
            }
            
            list.add(now);
        }
           

        return answer;
    }
}