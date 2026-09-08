class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long num = 0;
        
        for(int i = 1; i <= count; i++) {
            num = num + ((long) price * i);
        }
        
        if(money - num >= 0) {
            answer = 0;
        }
        else {
            answer = -1 * (money - num);
        }

        return answer;
    }
}