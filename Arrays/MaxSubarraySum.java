import java.util.*;
 public class MaxSubarraySum {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        arr[i]= sc.nextInt();
        int max= maxSubArray(arr);
        System.out.println(max);

    }
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;

        }
        return max;

    }
}
