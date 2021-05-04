class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0, maxl = 0;
        for (int i = 0; i < nums.length; i++) {
            max = 0;
            int a = nums[i];
            if (!set.contains(a - 1)) {

                while (set.contains(a++)) {
                    max++;
                }
            }
            maxl = Math.max(maxl, max);
        }
        return maxl;

    }
}