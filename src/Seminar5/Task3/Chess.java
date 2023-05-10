package Seminar5.Task3;

import Utility.JustFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Chess {
    int[][] chessBoard;
    List<Queen> queens = new ArrayList<>(8);

    public Chess() {
        chessBoard = new int[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = 0;
            }
        }

        JustFunction.printSquareArray(chessBoard);
    }

    public int[][] run(int x, int y) {
        int[][] board = new int[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
        List<Queen> list = new ArrayList<>();
        list.add(new Queen(x, y));

        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 8; j++) {
                for (int k = i; k < 8; k++) {
                    Queen queen = new Queen(j, k);
                    if (queen.moveQuinn(list)) {
                        list.add(queen);
                        board[j][k] = 1;
                    }

                }
            }
        }
        if (list.size() == 8) {
            return board;
        }

        chessBoard = (run(x + 1, y));

        return chessBoard;

    }


}
