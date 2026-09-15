import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        ArrayList<Integer> a = new ArrayList<>();
        int count0 = 0;
        int num = 0;
        
        for(int i = 0; i < s.length(); i++) {
           a.add(s.charAt(i) - '0');
        }
        
        while(a.size() > 1) {
            
            int count1 = 0; 
            
            for(int i = 0; i < a.size(); i++) {
                if(a.get(i) == 0) {
                    count0++;
                }
                else {
                    count1++;
                }
        
            }
            
            a.clear();
            
            while( count1 > 0) {
                a.add(count1 % 2);
                count1 = count1 / 2;
            }
            num++;
        }
        answer[0] = num;
        answer[1] = count0;
            
    
        return answer;
    }
}