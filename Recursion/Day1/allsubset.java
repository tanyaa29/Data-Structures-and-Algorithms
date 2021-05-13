//prog2
public class allsubset {
  
        public void func(int ind, int[] nums, List<Integer> ds, List<List<Integer>> res) {
            res.add(new ArrayList<>(ds));
            for (int i = ind; i < nums.length; i++) {
                if (i != ind && nums[i] == nums[i - 1])
                    continue;
                ds.add(nums[i]);
                func(i + 1, nums, ds, res);
                ds.remove(ds.size() - 1);
            }

        }

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            func(0, nums, new ArrayList<>(), ans);
            return ans;

        }
    
}
