import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        // 이름 : 등수
        HashMap<String, Integer> name = new HashMap<>();

        // 등수 : 이름
        HashMap<Integer, String> rank = new HashMap<>();

        // 1. 선수들의 초기 등수 저장
        for (int i = 0; i < players.length; i++) {
            name.put(players[i], i);
            rank.put(i, players[i]);
        }

        // 2. 추월 처리
        for (int i = 0; i < callings.length; i++) {

            String currentName = callings[i];

            // 현재 선수의 등수
            int currentRank = name.get(currentName);

            // 바로 앞 선수 이름
            String changeName = rank.get(currentRank - 1);

            // 이름 : 등수 변경
            name.put(currentName, currentRank - 1);
            name.put(changeName, currentRank);

            // 등수 : 이름 변경
            rank.put(currentRank - 1, currentName);
            rank.put(currentRank, changeName);
        }

        // 3. 최종 순위 배열 만들기
        String[] answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            answer[i] = rank.get(i);
        }

        return answer;
    }
}