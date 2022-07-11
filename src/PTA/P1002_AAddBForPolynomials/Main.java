package PTA.P1002_AAddBForPolynomials;

import java.util.*;

/**
 * @author sgpublic
 * @Date 2022/7/11 14:18
 */
public class Main {
    private static final int COUNT = 2;
    private static final int N_SIZE = 1001;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] coefficients = new Double[N_SIZE];
        PriorityQueue<Integer> exponents = new PriorityQueue<>(N_SIZE, (o1, o2) -> o2 - o1);
        for (int index = 0; index < COUNT; index++) {
            int k = input.nextInt();
            for (int ni = 0; ni < k; ni++) {
                int n = input.nextInt();
                double aNi = input.nextDouble();
                if (coefficients[n] == null) {
                    exponents.add(n);
                    coefficients[n] = aNi;
                } else {
                    coefficients[n] += aNi;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int size = 0;
        while (!exponents.isEmpty()) {
            int n = exponents.poll();
            // 由于 a_{N_i} 没有限定范围，因此极有可能（给的样例里也确实有）最后得到的系数为 0，
            // 而题目要求输出非零项，因此输出时需要检查系数是否为 0。
            if (coefficients[n] == null || coefficients[n] == 0) {
                continue;
            }
            size++;
            ans.append(" ").append(n);
            ans.append(String.format(" %.1f", coefficients[n]));
        }
        System.out.print(size);
        System.out.println(ans);
    }
}
