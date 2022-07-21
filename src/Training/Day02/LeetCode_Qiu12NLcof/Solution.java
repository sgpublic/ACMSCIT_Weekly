package Training.Day02.LeetCode_Qiu12NLcof;

/**
 * @author sgpublic
 * @Date 2022/7/21 12:42
 */
class Solution {
    public int sumNums(int n) {
        int[] tmp = new int[n];
        tmp[0] = 1;
        try {
            impl(tmp, 1);
        } catch (ArrayIndexOutOfBoundsException ignore) {
            // 不允许使用判断语句判断边界则利用数组完成
        }
        return tmp[n - 1];
    }

    // 不允许使用循环语句则使用递归
    private void impl(int[] arr, int index) {
        arr[index] = arr[index - 1] + index + 1;
        impl(arr, index + 1);
    }
}