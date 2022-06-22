package P0622;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/6/22 8:18
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        // 使用二分法查找第 N 个分数在哪一条斜线上
        // 为什么 end 是 1414 因为 N <= 10^6，而 1 + 2 + ... + 1414 = 1000405
        int start = 0, end = 1414, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            // 需要找到一个 mid 使得 1 + 2 + ... + mid < N <= 1 + 2 + ... + mid + (mid + 1)
            if (n <= count(mid)) {
                end = mid;
            } else if (n > count(mid + 1)) {
                start = mid;
            } else {
                break;
            }
        }
        // 此时得到的 mid 为 N 所在斜线上方的斜线条数，即 mid + 1 为 N 所在斜线
        // count 为 N 在其所在斜线第几个
        int line = mid + 1, count = n - count(mid);
        int dec = line - count + 1;
        // 如果斜线下标为奇数，则从左下向右上数，反之从右上向坐下数
        if (line % 2 == 0) {
            return count + "/" + dec;
        } else {
            return dec + "/" + count;
        }
    }

    private static int count(int n) {
        return (n + 1) * n / 2;
    }
}
