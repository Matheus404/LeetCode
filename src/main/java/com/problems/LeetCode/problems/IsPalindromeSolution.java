package com.problems.LeetCode.problems;

public class IsPalindromeSolution {

    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        StringBuilder str = new StringBuilder(num).reverse();

        return num.equals(str.toString());

    }
}
