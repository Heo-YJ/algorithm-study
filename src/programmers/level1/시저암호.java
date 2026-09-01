package programmers.level1;


public class 시저암호 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "AB";
        int n1 = 1;

        String s2 = "z";
        int n2 = 1;

        String s3 = "a B z";
        int n3 = 4;

        System.out.println(solution.solution(s1, n1));
        System.out.println(solution.solution(s2, n2));
        System.out.println(solution.solution(s3, n3));
    }

    static class Solution {
        public String solution(String s, int n) {

            char[] arr = s.toCharArray();

            for(int i=0; i<arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    if((int)arr[i]+n > 90) {
                        arr[i] = (char) (arr[i]+n-26);
                    } else {
                        arr[i] = (char) (arr[i]+n);
                    }
                }

                else if (arr[i] >= 'a' && arr[i] <= 'z') {
                    if((int)arr[i]+n > 122) {
                        arr[i] = (char) (arr[i]+n-26);
                    } else {
                        arr[i] = (char) (arr[i]+n);
                    }
                }
            }
            return new String(arr);


        }
    }
}
