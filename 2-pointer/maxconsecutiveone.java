public class maxconsecutiveone {
  
        public int findMaxConsecutiveOnes(int[] nums) {
            int cnt = 0, max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    cnt++;
                }
                if (nums[i] == 0)
                    cnt = 0;
                max = (max > cnt) ? max : cnt;

            }
            return max;

        }
    
}
