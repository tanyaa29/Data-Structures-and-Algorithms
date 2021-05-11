public class combinatiom2 {

        public void func(int ind, int target, int[] candidates, List<List<Integer>> ans, List<Integer> ds) {

            if (target == 0) {
                ans.add(new ArrayList<>(ds));
                return;
            }
            for (int i = ind; i < candidates.length; i++) {
                if (i > ind && candidates[i] == candidates[i - 1])
                    continue;
                if (candidates[i] > target)
                    break;

                ds.add(candidates[i]);
                func(i + 1, target - candidates[i], candidates, ans, ds);
                ds.remove(ds.size() - 1);
            }

        }

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            func(0, target, candidates, ans, new ArrayList<>());
            return ans;
        }
     
}
