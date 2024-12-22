package leetcode75.java;

//345. Reverse Vowels of a String
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class Leetcode345 {

    private final String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (left < right && !VOWELS.contains("" + arr[left])) {
                left++;
            }
            while (left < right && !VOWELS.contains("" + arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        Leetcode345 leetcode345 = new Leetcode345();
        String res = leetcode345.reverseVowels(s);
        System.out.println(res);
    }

}
