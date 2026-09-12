class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int a = 0;
        int b = 0;
            
        for(int i = 1; i < max; i++) {
            if((n % i == 0) && (m % i == 0)) {
                a = i;
            }
        }
        
        for(int i = n * m; i > 0; i--) {
            if((i % n == 0) && (i % m == 0)) {
                b = i;
            }
        }
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}