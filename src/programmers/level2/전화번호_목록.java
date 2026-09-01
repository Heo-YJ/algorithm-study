package programmers.level2;

import java.util.*;

public class 전화번호_목록 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] s1 = {"119", "97674223", "1195524421"};
        String[] s2 = {"123","456","789"};
        String[] s3 = {"12","123","1235","567","88"};

        System.out.println(solution.solution(s1));
        System.out.println(solution.solution(s2));
        System.out.println(solution.solution(s3));

    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            HashSet<String> phoneSet = new HashSet<>();

            for(String phone : phone_book) {
                phoneSet.add(phone);
            }

            for(int i=0; i<phone_book.length; i++) {
                for(int j=1; j<phone_book[i].length(); j++) {
                    if(phoneSet.contains(phone_book[i].substring(0,j))) {
                        answer = false;
                    }
                }
            }

            return answer;
        }
    }
}
