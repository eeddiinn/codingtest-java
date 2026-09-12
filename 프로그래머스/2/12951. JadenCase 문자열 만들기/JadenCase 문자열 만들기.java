class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count = 0;
                answer = answer + ' ';
            }
            else {
                if (count == 0) {
                    answer = answer + Character.toUpperCase(s.charAt(i));
                 count++;
                }
                else {
                    answer = answer + Character.toLowerCase(s.charAt(i));
                }
            }
        }
        return answer;
    }
}