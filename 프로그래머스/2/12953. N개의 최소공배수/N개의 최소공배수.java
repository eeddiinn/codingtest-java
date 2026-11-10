class Solution {
    public int solution(int[] arr) {

        int answer = arr[arr.length - 1];
        boolean check = false;

        while (!check) {

            check = true;

            for (int i = 0; i < arr.length; i++) {

                if (answer % arr[i] != 0) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                answer += arr[arr.length - 1];
            }
        }

        return answer;
    }
}