package Weekly.P0702;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author sgpublic
 * @Date 2022/7/2 8:26
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> map = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int l = input.nextInt() + 1, m = input.nextInt();
        while (m-- > 0) {
            int u = input.nextInt(), v = input.nextInt();
            for (int i = u; i <= v; i++) {
                map.add(i);
            }
        }
        System.out.println(l - map.size());
    }
}
