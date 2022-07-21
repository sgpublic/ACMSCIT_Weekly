package Training.Day01.LeetCode_RecursiveMulitplyLcci;

/**
 * @author sgpublic
 * @Date 2022/7/21 12:32
 */
class Solution {
    public int multiply(int A, int B) {
        int a = Math.max(A, B);
        int b = Math.min(A, B);
        return impl(0, a, b);
    }

    private int impl(int sum, int add, int times) {
        if (times <= 0) return sum;
        return impl(sum + add, add, times - 1);
    }
}