package com.problems.LeetCode.problems;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcdd");
        System.out.println("length: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> characters = new HashSet<>();

        int exe = 0;

        while (left < s.length()) {
            char a = s.charAt(left);
            if (!characters.contains(s.charAt(left))){
                characters.add(s.charAt(left));
                max = Math.max(max, characters.size());
                left++;
            } else {
                characters.remove(s.charAt(right));
                char p = s.charAt(right);
                right++;
            }
            exe++;
        }

        System.out.println("execucoes: " + exe);

        return max;
    }

}
