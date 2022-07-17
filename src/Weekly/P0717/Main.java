package Weekly.P0717;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/17 17:21
 */
public class Main {
    /** 数据量只有 10^3，因此可以直接提前计算分数，这样获取的时候复杂度就为 O(1) */
    private static final int[] goHobi = new int[1001];

    static {
        Arrays.fill(goHobi, 1, 3, 1);
        Arrays.fill(goHobi, 3, 7, 2);
        Arrays.fill(goHobi, 7, 30, 3);
        Arrays.fill(goHobi, 30, 120, 4);
        Arrays.fill(goHobi, 120, 1001, 5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0, checkDays = 0;
        int uncheckDays = 0;
        while (n-- > 0) {
            int index = input.nextInt();
            if (index == 0) {
                // 未打卡时仅增加未打卡连续天数，不计分
                uncheckDays++;
                continue;
            }
            // 连续打卡天数不低于 0
            checkDays = Math.max(0, checkDays - (int) Math.pow(2, uncheckDays - 1));
            // 重置连续未打卡天数
            uncheckDays = 0;
            checkDays++;
            ans += getGoHobi(checkDays);
        }
        System.out.println(ans);
    }

    /**
     * 获取当前连续打卡天数应得的分数
     * @param days 连续打卡天数
     * @return 分数
     */
    private static int getGoHobi(int days) {
        return days < 1 ? 0 : goHobi[days];
    }
}
