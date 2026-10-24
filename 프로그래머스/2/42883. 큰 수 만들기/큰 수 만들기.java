import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer ="";

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < number.length(); i++) {

            char now = number.charAt(i);

            while (!stack.isEmpty() && count < k) {

                char last = stack.peek();

                if (last < now) {
                    stack.pop();
                    count++;
                } else {
                    break;
                }
            }

            stack.push(now);
        }

        // 아직 제거할 숫자가 남았다면
        while (count < k) {
            stack.pop();
            count++;
        }

        for (int i = 0; i < stack.size(); i++) {
            answer = answer + stack.get(i);
        }

        return answer;
}
}