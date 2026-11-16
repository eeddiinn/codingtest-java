import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashSet<Integer> left = new HashSet<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        // 처음에는 모든 토핑이 오른쪽
        for (int i = 0; i < topping.length; i++) {
            right.put(topping[i],
                right.getOrDefault(topping[i], 0) + 1);
        }

        // 하나씩 왼쪽으로 옮김
        for (int i = 0; i < topping.length - 1; i++) {
            int num = topping[i];

            left.add(num);

            right.put(num, right.get(num) - 1);

            if (right.get(num) == 0) {
                right.remove(num);
            }

            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}