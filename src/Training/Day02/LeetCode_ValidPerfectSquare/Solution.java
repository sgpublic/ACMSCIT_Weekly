package Training.Day02.LeetCode_ValidPerfectSquare;

/** 二分法求解即可 */
class Solution {
    public boolean isPerfectSquare(int num) {
        long high = num;
        long low = 1;
        long half;
        while (high - low > 1) {
            half = (high + low) / 2;
            if (half * half > num) {
                high = half;
            } else {
                low = half;
            }
        }
        return (low * low == num);
    }
}
