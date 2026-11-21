
class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        // a월 이전 날짜 합산
        for(int i = 0; i < a - 1; i++) {
            sum += month[i];
        }

        // 지난 날짜 더하기
        sum += b - 1;

        return day[sum % 7];
    }
}
