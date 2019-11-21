package com.hemanthsavasere.string;

import java.util.Arrays;

public class BruteForcePatternMatching {
    public static int[] matchString(String mainString, String pattern) {
        int[] indices = new int[mainString.length()];
        int k = 0;
        boolean found;
        for (int i = 0; i < mainString.length(); i++) {
            found = true;
            if (mainString.charAt(i) == pattern.charAt(0)) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (mainString.charAt(j + i) != pattern.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found)
                    indices[k++] = i;
            }
        }
        return indices;
    }

    public static int[] endStringMatching(String mainString, String pattern) {
        int[] indices = new int[mainString.length()];
        boolean found;
        int k = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (i + pattern.length() <= mainString.length() && mainString.charAt(i + pattern.length() - 1) == pattern.charAt(pattern.length() - 1)) {
                found = true;
                for (int j = pattern.length() - 1; j >= 0; j--) {
                    if (mainString.charAt(i + j) != pattern.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found)
                    indices[k++] = i;
            }
        }
        return indices;
    }


    public static void main(String[] args) {
        String s1 = "FUN-UNCLE", s2 = "-UNCLE";
        System.out.println(Arrays.toString(matchString(s1, s2)));
        System.out.println(Arrays.toString(endStringMatching(s1, s2)));

    }
}
