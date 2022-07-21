package Training.Day02.LeedCode_TheKthFactorOfN;

import java.util.PriorityQueue;

/**
 * @author sgpublic
 * @Date 2022/7/21 13:34
 */
class Solution {
    public int kthFactor(int n, int k) {
        // 排列需求可直接用优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i != 0) {
                continue;
            }
            queue.add(i);
            if (i != sqrt) {
                queue.add(n / i);
            }
        }
        if (queue.size() < k) return -1;
        int ans = -1;
        while (k-- > 0 && !queue.isEmpty()) {
            ans = queue.poll();
        }
        return ans;
    }
}