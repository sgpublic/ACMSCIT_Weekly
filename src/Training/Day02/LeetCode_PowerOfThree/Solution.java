package Training.Day02.LeetCode_PowerOfThree;

/**
 * @author sgpublic
 * @Date 2022/7/21 13:02
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        return isPowerOfX(n, 3);
    }

    private boolean isPowerOfX(int n, int x) {
        // 幂运算的整数结果一定是正整数
        if (n <= 0) return false;
        // 任何数的 0 次方结果为 1
        if (n == 1) return true;
        // 将 n 转换为 x 进制
        String binary = Integer.toString(n, x);
        // 如果一个数是 x 的幂次方，则最高位一定是 1
        if (binary.charAt(0) != '1') return false;
        // 如果除了最高位其余都是 0 才为幂次方结果
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) != '0') return false;
        }
        return true;
    }
}