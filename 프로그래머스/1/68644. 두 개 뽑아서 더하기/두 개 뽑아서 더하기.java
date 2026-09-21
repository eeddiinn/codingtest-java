import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(! a.contains(numbers[i] + numbers[j])) {
                    a.add(numbers[i] + numbers[j]);
                }
            }
        }
        a.sort(null);
        
        answer = new int[a.size()];
        
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }        
        return answer;
    }
}