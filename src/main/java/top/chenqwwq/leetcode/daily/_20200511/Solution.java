package top.chenqwwq.leetcode.daily._20200511;

/**
 * 50. Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 * <p>
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 * <p>
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 说明:
 * <p>
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/powx-n
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chen
 * @date 2020/5/11 下午8:57
 */
public class Solution {
    public double myPow(double x, int n) {
        // 快速幂入门题吧
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (n == 0) {
            return 1.0f;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        }

        // 奇数
        if ((n & 1) == 1) {
            return x * myPow(x * x, n >> 1);
        } else {
            return myPow(x * x, n >> 1);
        }
    }
}