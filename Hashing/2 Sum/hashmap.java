class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
    
        Map<Integer, Integer> map = new HashMap<>();
        int complement=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], i);
        }
        int i=0;
        for( i=0;i<nums.length;i++)
        {
             complement= target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                break;
            }
        }
        return new int[] {i, map.get(complement)};
        
    }
}
