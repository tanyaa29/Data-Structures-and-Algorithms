class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3)
            return 0;
        int left[] = new int[n];
        int max = height[0];
        int right[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (height[i] > max)
                max = height[i];
            left[i] = max;
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (height[i] > max)
                max = height[i];
            right[i] = max;
        }
        int f = 0;
        for (int i = 0; i < n; i++) {
            f = f + Math.min(left[i], right[i]) - height[i];
        }
        return f;

    }
}