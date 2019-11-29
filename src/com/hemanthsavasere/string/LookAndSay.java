package com.hemanthsavasere.string;

public class LookAndSay {
    public static String lookAndSay(String s) {
        int cnt = 1;
        s = s + '$';
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                sb.append(cnt);
                sb.append(s.charAt(i));
                cnt = 1;
            } else {
                cnt += 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String start = "1";
        String res = lookAndSay(lookAndSay(lookAndSay(lookAndSay("11"))));
        System.out.println(res);
    }
}

