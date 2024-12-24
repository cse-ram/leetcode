package leetcode75.java;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

//1207. Unique Number of Occurrence
//https://leetcode.com/problems/unique-number-of-occurrences/

public class Leet1207 {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int num : frequencyMap.values()) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };

        Leet1207 leet1207 = new Leet1207();

        System.out.println(leet1207.uniqueOccurrences(arr));
    }

}