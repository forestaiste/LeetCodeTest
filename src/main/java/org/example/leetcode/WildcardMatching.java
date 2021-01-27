package org.example.leetcode;

public class WildcardMatching {
    public boolean isMatch(String s, String p) {

        int i = 0;
        int j = 0;
        while (i < s.length() || j < p.length() ) {
            char pattern = p.charAt(j);

            while ((pattern != '*' || pattern != '?') && (i < s.length() || j < p.length())) {

                if (i < s.length() && j < p.length()) {

                    char source = s.charAt(i);
                    pattern = p.charAt(j);

                    if (source != pattern)
                        return false;

                    i++;
                    j++;
                }
                else if (i < s.length()) {
                    if (pattern != '*')
                        return false;
                }
                else if (j < p.length()) {
                    return false;
                }

            }


        }
        return true;
    }
}
