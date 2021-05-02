class Solution {
    public int findDuplicate(int[] a) {
        int tort = a[0];
        int hare = a[0];
        // while(hare!=tort)
        do {
            tort = a[tort];
            hare = a[a[hare]];
        } while (hare != tort);
        tort = a[0];
        while (hare != tort) {
            hare = a[hare];
            tort = a[tort];
        }
        return tort;

    }
}