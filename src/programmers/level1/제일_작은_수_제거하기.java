package programmers.level1;


import java.util.Arrays;

//제일 작은 수 제거하기
public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {10};

        System.out.println(Arrays.toString(solution.solution(arr1)));
        System.out.println(Arrays.toString(solution.solution(arr2)));


    }

    static class Solution {
        public int[] solution(int[] arr) {

            int minIdx = 0;

            if(arr.length == 1) { return new int[]{-1}; }

            for (int i=1; i < arr.length; i++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
            }

            int[] newArr = new int[arr.length-1];
            System.arraycopy(arr, 0, newArr, 0, minIdx);
            System.arraycopy(arr, minIdx+1, newArr, minIdx, arr.length - minIdx - 1);


            return newArr;

        }

    }

}

