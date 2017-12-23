import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class leetcode350 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { -2147483648, 1, 2, 3 };
        int[] nums2 = new int[] { 1, -2147483648, -2147483648 };
        int[] res = intersect(nums1, nums2);
        for (int var : res) {
            System.out.print(var + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            int[] a = {};
            return a;
        }
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length, n = nums2.length, ii = 0, jj = 0;
        while (ii < m && jj < n) {
            if (nums1[ii] < nums2[jj]) {
                ++ii;
            } else if (nums1[ii] > nums2[jj]) {
                ++jj;
            } else {
                res.add(nums1[ii]);
                ++jj;
                ++ii;
            }
        }
        int[] ret = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i).intValue();
        }
        return ret;
    }
}