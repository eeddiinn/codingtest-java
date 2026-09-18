class Solution {
    public int solution(int n) {
        int answer = 0;
        int count_number = 0;
        int number = n;
        
        while( number > 0) {
            if(number % 2 == 1) {
                count_number++;
            }
            number = number / 2;
        }
        
        for(int i = n + 1; i < 1000000; i++) {
            int count_next = 0;
            int temp = i;
            
            while( temp > 0) {
                if(temp % 2 == 1) {
                    count_next++;
                }
                temp = temp / 2;
            }
            if(count_number == count_next) {
                    return i;
            } 
        }
    
        return answer;
    }
}