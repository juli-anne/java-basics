package com.julianne.leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        String test1 = "(){}[]";
        String test2 = "([{}])";
        String test3 = "(]";

        System.out.println(test1 + " -> " + solution.isValid(test1)); // true
        System.out.println(test2 + " -> " + solution.isValid(test2)); // true
        System.out.println(test3 + " -> " + solution.isValid(test3)); // false
    }
}