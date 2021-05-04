public class onePassHashmap {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int complement = 0;

        int i = 0;
        for (i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                break;
            }
            map.put(nums[i], i);
        }
        return new int[] { i, map.get(complement) };

    }
    
}
