import java.io.*;
import java.util.*;

class subset {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

// User function Template for Java//User function Template for Java
class Solution {
    void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> subset) {
        if (ind == N) {
            subset.add(sum);
            return;
        }
        // picking
        func(ind + 1, sum + arr.get(ind), arr, N, subset);
        // notpicking
        func(ind + 1, sum, arr, N, subset);
    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> subset = new ArrayList<>();
        func(0, 0, arr, N, subset);
        Collections.sort(subset);
        return subset;
        // code here
    }
}