package leetcode75;

//1768. Merge Strings Alternately
// https://leetcode.com/problems/merge-strings-alternately/description/

public class Leet1768 {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();

        for (int i = 0; i < Math.max(len1, len2); i++) {
            if (i < len1) {
                merged.append(word1.charAt(i));
            }
            if (i < len2) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }

    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";

        Leet1768 leet1768 = new Leet1768();

        String res = leet1768.mergeAlternately(word1, word2);
        System.out.println(res);
    }
}
