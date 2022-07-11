package Weekly.P0709.Q1423;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/9 15:03
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 用等比数列求和公式反求 n 即可
        // 即 s = a_1 * (1 - Math.pow(q, n)) / (1 - q)，求 n
        double s = new Scanner(System.in).nextDouble();
        // 用换底公式求对数，向上取整即为答案
        double n = Math.log(1 - s * 0.02 / 2) / Math.log(0.98);
        System.out.println((int) Math.ceil(n));
    }
}
