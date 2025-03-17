package exercicios.exs01;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean fimJogo = false;
        char player = 'X';
        int jogadas = 0;

        do {
            imprimirJogo(board);

            int linha, coluna;
            boolean jogadaValida;
            do {
                System.out.println("Vez do jogador " + player);
                System.out.print("Digite a linha (0-2): ");
                linha = sc.nextInt();
                System.out.print("Digite a coluna (0-2): ");
                coluna = sc.nextInt();
                jogadaValida = validarJogada(board, linha, coluna);
                if (!jogadaValida) {
                    System.out.println("\n=== Jogada inválida! Tente novamente. ===\n");
                }
            } while (!jogadaValida);
            board[linha][coluna] = player;
            jogadas++;
            fimJogo = verificarFimJogo(board, player);
            if (!fimJogo && jogadas == 9) {
                System.out.println("\n=== Empate! ===");
                fimJogo = true;
            }
            if (!fimJogo) {
                player = (player == 'X') ? 'O' : 'X';
            }

        } while (!fimJogo);

        imprimirJogo(board);
        sc.close();
    }

    private static boolean validarJogada(char[][] board, int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }
        return board[linha][coluna] == ' ';
    }

    public static void imprimirJogo(char[][] board) {
        System.out.println("\n  0 1 2");
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(linha + ":");
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(board[linha][coluna]);
                if (coluna < 2) System.out.print("|");
            }
            System.out.println();
            if (linha < 2) System.out.println("  -----");
        }
        System.out.println();
    }

    public static boolean verificarFimJogo(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                System.out.println("\nJogador " + player + " venceu!");
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                System.out.println("\nJogador " + player + " venceu!");
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            System.out.println("\nJogador " + player + " venceu!");
            return true;
        }

        return false;
    }
}