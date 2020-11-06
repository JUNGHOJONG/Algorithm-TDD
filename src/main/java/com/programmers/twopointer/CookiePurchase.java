package com.programmers.twopointer;

public class CookiePurchase {
    public int main(int[] cookie){
        Solution_CookiePurchase processCommand = new Solution_CookiePurchase();
        return processCommand.solution(cookie);
    }
}

class Solution_CookiePurchase {

    private int max = 0;

    public int solution(int[] cookie) {
        for(int i=0; i<cookie.length - 1; i++){
            compareCookie(i, cookie);
        }
        return max;
    }

    public void compareCookie(int index, int[] cookie){
        int leftIndex = index;
        int rightIndex = index + 1;
        int leftSum = cookie[leftIndex];
        int rightSum = cookie[rightIndex];
        while(true){
            if(leftSum == rightSum) {
                max = Math.max(max, leftSum);
            }
            if(leftSum > rightSum && rightIndex < cookie.length - 1){
                rightIndex++;
                rightSum += cookie[rightIndex];
                continue;
            }
            if(leftSum <= rightSum && leftIndex > 0){
                leftIndex--;
                leftSum += cookie[leftIndex];
                continue;
            }
            break;
        }
    }
}