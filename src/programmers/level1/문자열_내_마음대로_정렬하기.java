package programmers.level1;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String []args) {
        Solution solution = new Solution();

        String[] s1 = {"sun", "bed", "car"};
        int n1 = 1;

        String[] s2 = {"abce", "abcd", "cdx"};
        int n2 = 2;


        System.out.println(Arrays.toString(solution.solution(s1, n1)));
        System.out.println(Arrays.toString(solution.solution(s2, n2)));
    }

    static class Solution {
        public String[] solution(String[] strings, int n) {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings.length - 1; j++) {
                    char c1 = strings[j].charAt(n); //sun //bed
                    char c2 = strings[j + 1].charAt(n); //bed //car
                    if (c1 > c2) { // bed, sun, car -> bed, car, sun //car, bed, sun
                        String tmp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = tmp;
                    }
                    else if(c1 == c2) {
                        if(strings[j].compareTo(strings[j+1]) > 0) {
                            String tmp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = tmp;
                        }
                    }
                }

            }
            return strings;
        }
    }
}
