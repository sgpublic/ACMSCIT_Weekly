package Weekly.P0709.Q1421;

import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/9 15:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = input.nextInt() + (double) input.nextInt() / 10;
        System.out.println((int) (total / 1.9));
    }
}
