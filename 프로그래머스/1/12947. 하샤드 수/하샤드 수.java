class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int y = x;
        
        while ( y > 0) {
            sum = sum + (y % 10);
            y = y / 10;
        }
        
        if ( x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}