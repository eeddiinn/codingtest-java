class Solution {
    public long solution(int n) {
        long answer = 0;

        if (n == 1) {
            return 1;
        }

        long a = 1; // n=1
        long b = 2; // n=2

        for (int i = 3; i <= n; i++) {
            answer = (a + b) % 1234567;

            a = b;
            b = answer;
        }

        return b;
    }
}