class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        // lowest index is found
        int point = start;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int realmid = (mid + point) % n;
            if (nums[realmid] == target)
                return realmid;
            else if (nums[realmid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;

    }
}
