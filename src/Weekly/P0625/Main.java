package Weekly.P0625;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/6/25 9:18
 */
public class Main {
    private static final int[] ans = new int[16];

    static {
        double sum = 0;
        int index = 1, k = 0;
        while (sum < 15) {
            sum += 1d / index;
            int tmp = (int) sum;
            if (tmp != k && sum != tmp) {
                k = tmp;
                ans[k] = index;
            }
            index++;
        }
    }

    public static void main(String[] args) {
        // 打表大法 yyds
        int k = new Scanner(System.in).nextInt();
        System.out.println(ans[k]);
    }
}
