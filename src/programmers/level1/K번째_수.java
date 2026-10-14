package programmers.level1;

import java.util.Arrays;

public class K번째_수 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution.solution(array, commands)));
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i=0; i<commands.length; i++) {
                int[] subArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(subArray);
                answer[i] = subArray[commands[i][2]-1];
            }

            return answer;

        }

    }
}
