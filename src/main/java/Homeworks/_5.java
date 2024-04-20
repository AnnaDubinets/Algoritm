package Homeworks;
//Задание 3: Определение возможности заплатить требуемую сумму монетами

public class _5 {
    public static boolean canPay(int[] coins, int total, int index) {
        if (total == 0) {
            return true;
        }
        if (index == coins.length) {
            return false;
        }
        if (coins[index] > total) {
            return canPay(coins, total, index + 1);
        } else {
            return canPay(coins, total - coins[index], index + 1) || canPay(coins, total, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] coins = {5, 5, 3, 3, 2};
        int total = 11;
        System.out.println(canPay(coins, total, 0)); // Output: true
    }
}
