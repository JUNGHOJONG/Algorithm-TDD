package com.leetcode.list;

/*
 작성자: Davinci.J
 일자: 2022/02/20
 leetCode 66 번 문제(Plus One)
 */
public class LeetCode66 {

    public static void main(String[] args) {
        int[] test1 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 이 예시로 첫번째 방법에 적용하면 int 에

        Solution_LeetCode66 solution_leetCode66 = new Solution_LeetCode66();
        solution_leetCode66.solution01(test1);
        solution_leetCode66.solution02(test1);
    }

    public int[] mains(int[] args) {
        Solution_LeetCode66 solution_leetCode66 = new Solution_LeetCode66();
        return solution_leetCode66.solution02(args);
    }
}

class Solution_LeetCode66 {

    /**
     * 테스트케이스 -> int[] test1 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
     * 이 방법의 한계점: test1 배열을 input 값으로 받아 실행할 경우, 배열값들을 문자열로 만든 후 다시 정수값으로 변환하는 과정에서
     * 해당 정수값이 int 의 허용범위를 넘을 수 있다 -> NumberFormatException 발생
     */
    public int[] solution01(int[] input) {
        // 배열 -> 숫자 -> 배열
        // 1. 배열을 읽으면서 StringBuffer 로 문자열로 만든다.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : input) {
            stringBuilder.append(i);
        }

        // 2. 정수를 문자열로 바꾼다.(정수 + 1)
        String s = String.valueOf(Integer.parseInt(stringBuilder.toString()) + 1);

        // 3. 배열 에 각 숫자를 담아 리턴한다.
        int[] arrays = new int[s.length()];

        for (int i=0; i<s.length(); i++) {
            arrays[i] = s.charAt(i) - '0';
        }

        return arrays;
    }

    /**
     * <solution01 의 한계점 해결>
     * 접근방법
     *  끝에서부터 순회하면서 진행. 해당값 + 1이 10이면 계속 진행하고 그 값을 0으로 바꾼다.
     *  10이 아니면 그 값 + 1 로 바꾸고 break
     *  flag 변수를 사용해서 break 를 타지않고 종료 했을경우, 맨앞 값이 1인 배열(길이 + 1 -> 맨앞 제외 모든 배열값은 0) 을 리턴한다.
     */
    public int[] solution02(int[] digits) {
        int length = digits.length;
        boolean digitIncrementYn = true;
        for (int i=length-1; i>=0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                digitIncrementYn = false;
                break;
            }
        }

        int[] result = new int[length + 1];
        if (digitIncrementYn) {
            result[0] = 1;
            return result;
        }

        return digits;
    }
}