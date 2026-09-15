class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 1; i <= n; i++) {
            sum = i;
            
            if(i == n) {
                answer++;
            }
            
            for(int j = i + 1; j <= n; j++) {
                sum = sum + j;
                
                if(sum == n) {
                    answer++;
                }
                else if(sum < n) {
                    continue;
                }
                else {
                    break;
            }
            }
        }
        
        return answer;
    }
}
