class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        boolean isNum = true;
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)) ) {
                isNum = false;
            }
        }
        
        if( (s.length() == 4 || s.length() == 6) && isNum ) {
            return answer;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}