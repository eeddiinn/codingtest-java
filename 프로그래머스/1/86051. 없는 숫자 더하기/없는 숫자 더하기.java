import java.util.*; 

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        for (int i = 0; i < numbers.length; i++) {
            if (a.contains(numbers[i])) {
                a.remove(Integer.valueOf(numbers[i]));
            }
        }
        
       for (int i = 0; i < a.size(); i++) {
           answer += a.get(i);
       }
        
        return answer;
    }
}