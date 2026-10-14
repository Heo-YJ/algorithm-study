package programmers.level1;

import java.util.HashMap;

//완주하지 못한 선수
public class 완주하지_못한_선수 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        System.out.println(solution.solution(participant1, completion1));
        System.out.println(solution.solution(participant2, completion2));
        System.out.println(solution.solution(participant3, completion3));


    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {

            String answer = "";

            HashMap<String, Integer> marathon = new HashMap<String, Integer>();

            for (int i = 0; i < participant.length; i++) {
                if (marathon.containsKey(participant[i])) {
                    marathon.put(participant[i], marathon.get(participant[i]) + 1);
                } else {
                    marathon.put(participant[i], 1);
                }
            }

            for (int i = 0; i < completion.length; i++) {
                if (marathon.containsKey(completion[i])) {
                    marathon.put(completion[i], marathon.get(completion[i]) - 1);
                }
            }

            for (String key : marathon.keySet()) {
                if (marathon.get(key) == 1) {
                    answer = key;
                    break;
                }

            }



            return answer;

        }
    }


}
