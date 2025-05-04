package com.gabrielmaran.exercicios;

public class LeetCode {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        Solution solution = new Solution();
        boolean resp = solution.checkValid(matrix);
        System.out.println(resp);
    }
}

class Solution {
    public boolean checkValid(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        boolean validacao = true;
        for (int j = 0; j < 2; j++) {
            validacao = isValidBox(new int[][]{
                    new int[]{matrix[j][0]}, new int[]{matrix[j][1]}, new int[]{matrix[j][2]}
            });
            if (!validacao) return false;
            validacao = isValidBox(new int[][]{
                    new int[]{matrix[0][j]}, new int[]{matrix[1][j]}, new int[]{matrix[2][j]}
            });
            if (!validacao) return false;
        }
        return validacao;
    }

    public static boolean isValidBox(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; i < j; j--) {
                if (board[i][0] == '.') break;
                if (board[i][0] - board[j][0] == 0) return false;
            }
        }
        return true;
    }
}
