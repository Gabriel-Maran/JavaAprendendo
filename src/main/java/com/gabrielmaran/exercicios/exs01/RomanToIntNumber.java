package com.gabrielmaran.exercicios.exs01;


public class RomanToIntNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String x = "IV";
        Integer isNumPalindrome = solution.romanToInt(x);
        System.out.println(isNumPalindrome);
    }
}

class Solution {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(romanNumber(s.charAt(i)) < romanNumber(s.charAt(i + 1))) {
                value -= romanNumber(s.charAt(i));
            }else{
                value += romanNumber(s.charAt(i));
            }
        }
        value = value + romanNumber(s.charAt(s.length() - 1));

        return value;
    }

    public int romanNumber(Character c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}