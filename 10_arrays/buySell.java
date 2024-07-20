public class buySell {

    public static int buySell(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            if (minPrice < prices[i]) {
                int profit = prices[i] - minPrice;  
                maxProfit = Math.max(profit, maxProfit);
            } else {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buySell(prices));
    }
}