class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;
        
        for(int i = 0; i < length ; i++) {
            if(signs[i] == false) {
                absolutes[i] = (-1) * absolutes[i];
            }
            answer += absolutes[i];
        }
        
        return answer;
    }
}