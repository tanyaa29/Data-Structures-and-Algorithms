import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class knapsack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0, k = 0; i < n; i++) {
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends

/*
 * class Item { int value, weight; Item(int x, int y){ this.value = x;
 * this.weight = y; } }
 */

class Solution {

    class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double A = a.value * 1.0d / a.weight;
            double B = b.value * 1.0d / b.weight;

            if (A < B)
                return 1;

            else if (A > B)
                return -1;

            return 0;
        }
    }

    double fractionalKnapsack(int W, Item arr[], int n) {

        Arrays.sort(arr, new ItemComparator());

        double profit = 0d;
        for (Item i : arr) {
            profit += Math.min(i.weight, W) * (i.value * 1.0d / i.weight);
            W -= Math.min(i.weight, W);
        }

        return profit;
    }
}
