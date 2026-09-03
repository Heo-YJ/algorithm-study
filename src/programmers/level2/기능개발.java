package programmers.level2;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};

        int[] speeds1 = {1, 30, 5}; //100-93=7/1=7 //100-30=70/30=2.
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution.solution(progresses1, speeds1)));
        System.out.println(Arrays.toString(solution.solution(progresses2, speeds2)));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            Queue<Integer> deploy = new LinkedList<>();

            for(int i=0; i<progresses.length; i++) {
                int day = (int) Math.ceil((100.0-progresses[i])/speeds[i]);
                deploy.add(day); // {7, 3, 9}
            }

            List<Integer> result = new ArrayList<>();

            while(!deploy.isEmpty()) {
                int firstDay = deploy.poll();
                int cnt = 1;
                while(!deploy.isEmpty() && deploy.peek() <= firstDay) {
                    deploy.poll();
                    cnt++;
                }
                result.add(cnt);
            }

            int[] answer = new int[result.size()];

            for(int i=0; i<result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;

        }
    }

}
