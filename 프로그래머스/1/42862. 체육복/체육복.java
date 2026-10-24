class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];

        // 1. 도난당한 학생
        for (int i = 0; i < lost.length; i++) {
            clothes[lost[i]]--;
        }

        // 2. 여벌 체육복이 있는 학생
        for (int i = 0; i < reserve.length; i++) {
            clothes[reserve[i]]++;
        }

        // 3. 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (clothes[i] == -1) {

                // 앞번호 학생에게 빌리기
                if (i > 1 && clothes[i - 1] == 1) {
                    clothes[i - 1]--;
                    clothes[i]++;
                }
                // 뒷번호 학생에게 빌리기
                else if (i < n && clothes[i + 1] == 1) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }

        // 4. 수업을 들을 수 있는 학생 수
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }
}