package com.gabrielmaran.exercicios.exs01;

public class ValidadorDeSudoku {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[][] {
                {'.', '.', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'1', '.', '.', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '2', '.', '6', '.', '.'},
                {'.', '9', '.', '.', '.', '.', '.', '7', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '8', '.', '.', '.', '.', '.'}
        };
        boolean resp = solution.isValidSudoku(board);
        System.out.println(resp);
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean validacao = isValidBox(new char[][]{
                        new char[]{board[i][j]}, new char[]{board[i][j + 1]}, new char[]{board[i][j + 2]},
                        new char[]{board[i + 1][j]}, new char[]{board[i + 1][j + 1]}, new char[]{board[i + 1][j + 2]},
                        new char[]{board[i + 2][j]}, new char[]{board[i + 2][j + 1]}, new char[]{board[i + 2][j + 2]}
                });
                if (!validacao) return false;
            }
        }
        boolean validacao = true;
        for (int j = 0; j < 9; j++) {
            validacao = isValidBox(new char[][]{
                    new char[]{board[j][0]}, new char[]{board[j][1]}, new char[]{board[j][2]},
                    new char[]{board[j][3]}, new char[]{board[j][4]}, new char[]{board[j][5]},
                    new char[]{board[j][6]}, new char[]{board[j][7]}, new char[]{board[j][8]},
            });
            if (!validacao) return false;
            validacao = isValidBox(new char[][]{
                    new char[]{board[0][j]}, new char[]{board[1][j]}, new char[]{board[2][j]},
                    new char[]{board[3][j]}, new char[]{board[4][j]}, new char[]{board[5][j]},
                    new char[]{board[6][j]}, new char[]{board[7][j]}, new char[]{board[8][j]},
            });
            if (!validacao) return false;
        }

        return true;
    }

    public static boolean isValidBox(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 8; i < j; j--) {
                if (board[i][0] == '.') break;
                if (board[i][0] - board[j][0] == 0) return false;
            }
        }
        return true;
    }
}