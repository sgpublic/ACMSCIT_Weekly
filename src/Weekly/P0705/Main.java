package Weekly.P0705;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/5 9:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0, max = 8;
        for (int i = 1; i <= 7; i++) {
            int tmp = input.nextInt() + input.nextInt();
            if (tmp > max) {
                index = i; max = tmp;
            }
        }
        if (max <= 8) {
            System.out.println(0);
        } else {
            System.out.println(index);
        }
    }
}
