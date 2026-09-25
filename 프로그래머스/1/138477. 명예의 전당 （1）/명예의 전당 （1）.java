import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> a = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++) { 
            a.add(score[i]);
            
            if(a.size() > k) {
                a.poll();
            }
            
            answer[i] = a.peek();
        
        }
        
        return answer;
    }
}