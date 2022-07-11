package Weekly.P0706;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/6 8:58
 */
public class Main {
    private static int checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            int tmp = num / i;
            if (tmp * i == num) {
                return checkPrime(tmp);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int ans = checkPrime(num);
        System.out.println(Math.max(ans, num / ans));
    }
}
