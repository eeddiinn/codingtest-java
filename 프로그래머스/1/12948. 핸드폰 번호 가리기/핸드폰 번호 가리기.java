class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int count = 0;
        String p = phone_number;
        
        for(int i = p.length() - 1; i >=0; i--) {
           if(count > 3) {
               answer = '*' + answer;
               continue;
           }
            answer = p.charAt(i) + answer;
            count++;
        }
        return answer;
    }
}