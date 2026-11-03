import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 우선순위 큐에 넣기
        for(int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        // 모든값이 k 이상 될때까지
        while(pq.peek() < K){
            
            if(pq.size() >= 2) {
                int first = pq.poll();
                int second = pq.poll();
            
                pq.offer(first + (second * 2));
            
                answer++;
            }
            else {
                return -1;
            }
        }
    
        return answer;
    }
}