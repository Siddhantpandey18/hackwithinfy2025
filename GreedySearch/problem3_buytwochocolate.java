public class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = 101, min2 = 101;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int total = min1 + min2;
        if (total <= money) {
            return money - total;
        } else {
            return money;
        }
    }
}