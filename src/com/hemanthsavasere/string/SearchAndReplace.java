package com.hemanthsavasere.string;

import java.util.Arrays;

public class SearchAndReplace {
    public static int[] searchPattern(String s1, String s2) {
        int[] index = new int[s1.length()];
        int k = 0;
        boolean found;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                found = true;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    index[k++] = i;
                }
            }
        }
        return index;
    }

    public static String searchAndReplacePattern(String mainString, String pattern, String replace) {
        int[] k = searchPattern(mainString, pattern);
        int ind = 0, i = 0;
        StringBuilder res = new StringBuilder();
        while (i < mainString.length()) {
            if (i != k[ind]) {
                res.append(mainString.charAt(i));
                i++;
            } else {
                res = res.append(replace);
                i = i + pattern.length();
                ind++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s1 = "FUN-UNCLE", s2 = "UN", replace = "FUCK";
        System.out.println(searchAndReplacePattern(s1, s2, replace));

    }
}
