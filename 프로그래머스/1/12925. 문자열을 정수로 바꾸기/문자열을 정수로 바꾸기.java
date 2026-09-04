class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            for (int i = 1; i < length; i++) {
                answer = answer * 10 + (s.charAt(i) - '0');
            }
            if (s.charAt(0) == '-'){
                answer = -answer;
            }
        }
        
        else {
            for (int i = 0; i < length; i++) {
                answer = answer * 10 + (s.charAt(i) - '0');
            }
        }
       
        return answer;
    }
}