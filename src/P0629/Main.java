package P0629;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/6/29 9:40
 */
public class Main {
    public static void main(String[] args) {
        int[] apples = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            apples[i] = input.nextInt() - 30;
        }
        int tt = input.nextInt();
        input.close();
        int ans = 0;
        for (int apple : apples) {
            if (apple <= tt) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
