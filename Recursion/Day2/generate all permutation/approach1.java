class Solution {
    public void func(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] f) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!f[i]) {
                f[i] = true;
                ds.add(nums[i]);
                func(nums, ds, ans, f);
                ds.remove(ds.size() - 1);
                f[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] f = new boolean[nums.length + 1];
        func(nums, ds, ans, f);
        return ans;

    }
}