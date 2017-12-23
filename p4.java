import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class p4 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2};
        int[] nums2 = new int[] { 3, 4 };
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.print(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merged = new ArrayList<>();
        for (int var : nums1) {
            merged.add(var);
        }
        for (int var : nums2) {
            merged.add(var);
        }
        int size = merged.size();
        int[] mergedArray = new int[size];
        for (int i = 0; i < size; ++i) {
            mergedArray[i] = merged.get(i);
        }
        Arrays.sort(mergedArray);
        if (size % 2 == 0) {
            return (mergedArray[size / 2] + mergedArray[size / 2 - 1]) / 2.0;
        } else {
            return mergedArray[size / 2];
        }
    }
}