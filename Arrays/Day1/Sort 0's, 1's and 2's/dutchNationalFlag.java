//Dutch National Flag Algorithm
class Solution {
    public void sortColors(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int tmp = a[low];
                a[low] = a[mid];
                a[mid] = tmp;
                mid++;
                low++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int tmp = a[mid];
                a[mid] = a[high];
                a[high] = tmp;
                high--;
            }
        }
    }

}