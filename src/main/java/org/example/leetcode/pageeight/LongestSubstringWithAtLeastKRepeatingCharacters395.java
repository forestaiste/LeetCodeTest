package org.example.leetcode.pageeight;

public class LongestSubstringWithAtLeastKRepeatingCharacters395 {
    public int longestSubstring(String s, int k) {
        int[] map = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int c = s.charAt(i) - 'a';

            map[c]++;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int c = s.charAt(i) - 'a';

            if (map[c] >= k)
                builder.append(s.charAt(i));
        }

        return builder.length();
    }

    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters395 longestSubstringWithAtLeastKRepeatingCharacters
                = new LongestSubstringWithAtLeastKRepeatingCharacters395();
        System.out.println(longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("ababbc", 2));
    }
}
