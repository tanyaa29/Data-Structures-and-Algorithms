class approach2NO_extraspace {
    public void func(int index, int[] nums, List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            List<Integer> ds= new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
           swap(i,index,nums);
            func(index+1, nums, ans);
            swap(i,index,nums);
        }
    }
    public void swap(int a,int b,int[]nums)
    {
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList<>();
        func(0,nums, ans);
        return ans;
        
    }
}