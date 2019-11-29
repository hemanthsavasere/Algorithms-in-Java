package com.hemanthsavasere.string;

import java.util.Stack;

public class ReverseVowels {
    public static String vowelsReverse(String s1) {
        char[] word = s1.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < word.length; i++) {
            if ("aeiou".contains(String.valueOf(word[i]))) {
                st.push(word[i]);
                word[i] = '\t';
            }
        }

        int i = 0;

        while (i < word.length || !st.empty()) {
            if (word[i] == '\t') {
                word[i] = st.pop();
            }
            i++;
        }
        return new String(word);
    }

    public static void main(String[] args) {
        String s1 = "united states";
        System.out.println(vowelsReverse(s1));
    }
}
