package programmers.level1;

import java.util.ArrayList;
import java.util.List;

//소수 찾기
public class findingPrimes {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 10;
        int n2 = 5;

        System.out.println(solution.solution(n1));
        System.out.println(solution.solution(n2));
    }

    static class Solution {
        public int solution(int n) {

            boolean[] isPrime = new boolean[n+1];

            for(int i=2; i<isPrime.length; i++) {
                isPrime[i] = true;
            }

            /*
            //2를 제외한 2의배수 지우기
            for(int i=4; i<=n; i+=2) { isPrime[i] = false; }

            //3을 제외한 3의배수 지우기
            for(int i=6; i<=n; i+=3) { isPrime[i] = false; }

            //5를 제외한 5의배수 지우기
            for(int i=10; i<=n; i+=5) { isPrime[i] = false; }
            */

            for(int i=2; i<=Math.sqrt(n); i++) {
                if(isPrime[i]) {
                    for(int j=i*2; j<=n; j+=i) {
                        isPrime[j] = false;
                    }
                }
            }

            int cnt = 0;

            for(boolean answer : isPrime) {
                if (answer) { cnt++; }
            }

            return cnt;

        }
    }
}
