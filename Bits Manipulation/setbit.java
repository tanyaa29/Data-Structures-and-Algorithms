public public class Solution {
    public int solve(int A) {
        if (A == 0)
            return 0;
        int x = largest(A);
        int bitstox = x * (1 << (x - 1));
        int msb = A - (1 << x) + 1;
        int rest = A - (1 << x);
        int ans = bitstox + msb + solve(rest);
        return ans;

    }

    public int largest(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}

class setbit {
    
}
