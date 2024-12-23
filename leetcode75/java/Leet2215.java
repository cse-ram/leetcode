package leetcode75.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

// 2215. Find the Difference of Two Arrays
// https://leetcode.com/problems/find-the-difference-of-two-arrays/

public class Leet2215 {

    private Set<Integer> getUniqueSet(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = getUniqueSet(nums1);
        Set<Integer> set2 = getUniqueSet(nums2);

        List<Integer> uniqueToNums1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                uniqueToNums1.add(num);
            }
        }

        List<Integer> uniqueToNums2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                uniqueToNums2.add(num);
            }
        }

        return Arrays.asList(uniqueToNums1, uniqueToNums2);

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };

        Leet2215 leet2215 = new Leet2215();
        System.out.println(leet2215.findDifference(nums1, nums2));
    }
}