package programmers.level2;

import java.util.*;

public class 올바른_괄호 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(solution.solution(s1));
        System.out.println(solution.solution(s2));
        System.out.println(solution.solution(s3));
        System.out.println(solution.solution(s4));

    }

    static class Solution {
        boolean solution(String s) {

            Stack<Character> stackStr = new Stack<>();
            for(char c : s.toCharArray()) {
                if (c == '(') {
                    stackStr.push(c);
                } else {
                    if(!stackStr.empty()) {
                        stackStr.pop();
                    } else {
                        return false;
                    }
                }
            }

            return stackStr.empty();
        }
    }
}
