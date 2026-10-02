import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] array = new int[3];

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int countA = 0;
        int countB = 0;
        int countC = 0;

        for(int i = 0; i < answers.length; i++) {

            if(a[i % a.length] == answers[i]) {
                countA++;
            }

            if(b[i % b.length] == answers[i]) {
                countB++;
            }

            if(c[i % c.length] == answers[i]) {
                countC++;
            }
        }

        array[0] = countA;
        array[1] = countB;
        array[2] = countC;

        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}