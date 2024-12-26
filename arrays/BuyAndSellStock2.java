package arrays;

public class BuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices={ 7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int mp = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i + 1] - prices[i] > 0)
                mp = mp + prices[i + 1] - prices[i];

        }

         System.out.println(mp);
    }
}
