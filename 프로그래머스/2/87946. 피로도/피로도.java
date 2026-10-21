import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {

        int answer = 0;

        Stack<int[]> stack = new Stack<>();

        // {남은 피로도, 탐험한 던전 수, 방문 상태}
        stack.push(new int[]{k, 0, 0});

        while (!stack.isEmpty()) {

            int[] now = stack.pop();

            int energy = now[0];
            int count = now[1];
            int visited = now[2];

            answer = Math.max(answer, count);

            for (int i = 0; i < dungeons.length; i++) {

                // 이미 방문한 던전이면 건너뛰기
                if ((visited & (1 << i)) != 0) {
                    continue;
                }

                // 현재 피로도로 입장할 수 있다면
                if (energy >= dungeons[i][0]) {

                    int nextEnergy = energy - dungeons[i][1];
                    int nextCount = count + 1;
                    int nextVisited = visited | (1 << i);

                    stack.push(new int[]{
                        nextEnergy,
                        nextCount,
                        nextVisited
                    });
                }
            }
        }

        return answer;
    }
}