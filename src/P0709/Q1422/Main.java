package P0709.Q1422;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/9 15:03
 */
public class Main {
    private static final int LEVEL_2 = 400;
    private static final int LEVEL_1 = 150;

    public static void main(String[] args) {
        int total = new Scanner(System.in).nextInt();
        double tmp, ans = 0;
        if (total > LEVEL_2) {
            tmp = total - LEVEL_2;
            ans += tmp * 0.5663;
            total -= tmp;
        }
        if (total > LEVEL_1) {
            tmp = total - LEVEL_1;
            ans += tmp * 0.4663;
            total -= tmp;
        }
        ans += total * 0.4463;
        System.out.printf("%.1f\n", ans);
    }
}
