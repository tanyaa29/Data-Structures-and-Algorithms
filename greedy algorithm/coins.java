public class coins {
        public int coinChange(int[] coins, int amount) {
            int n = coins.length;
            Arrays.sort(coins);
            int f = 0;

            for (int i = n - 1; i >= 0; i--) {
                while (amount >= coins[i]) {
                    amount -= coins[i];
                    f++;
                }
            }
            if (amount != 0)
                return -1;
            return f;

        }
}
