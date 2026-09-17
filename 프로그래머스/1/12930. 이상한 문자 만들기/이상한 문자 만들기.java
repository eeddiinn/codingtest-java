class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
            
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == ' ') {
                answer = answer + " ";
                count = 0;
                continue;
            }
            
            if(count % 2 == 0) {
                answer = answer + Character.toUpperCase(s.charAt(i));
                count++;
                continue;
            }
            else {
                answer = answer + Character.toLowerCase(s.charAt(i));
                count++;
                continue;
            }
        }
        
        return answer;
    }
}