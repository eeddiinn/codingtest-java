import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> a = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            a.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++) {

            HashMap<String, Integer> b = new HashMap<>();

            for(int j = i; j < i + 10; j++) {
                if(a.containsKey(discount[j])) {
                    b.put(discount[j], b.getOrDefault(discount[j], 0) + 1);
                }
            }

            if(a.equals(b)) {
                answer++;
            }
        }

        return answer;
    }
}