import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {

        int answer = 0;

        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{0, 0});

        while (!stack.isEmpty()) {

            int[] now = stack.pop();

            int index = now[0];
            int sum = now[1];

            if (index == numbers.length) {

                if (sum == target) {
                    answer++;
                }

                continue;
            }

            stack.push(new int[]{
                index + 1,
                sum + numbers[index]
            });

            stack.push(new int[]{
                index + 1,
                sum - numbers[index]
            });
        }

        return answer;
    }
}