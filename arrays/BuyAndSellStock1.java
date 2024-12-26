package arrays;

public class BuyAndSellStock1 {
    public static void main(String[] args) {

        int[] prices={ 7, 1, 5, 3, 6, 8};

        int n = prices.length;
        int[] ngi = new int[n];

        int mp = 0;
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (true) {
                if (top == -1) {
                    ngi[i] = prices[i];
                    stack[++top] = prices[i];
                    break;

                } else if (prices[i] < stack[top]) {
                    ngi[i] = stack[top];
                    break;
                } else {
                    top--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (ngi[i] - prices[i] > mp)
                mp = ngi[i] - prices[i];
        }

        System.out.println(mp);

    }
}
