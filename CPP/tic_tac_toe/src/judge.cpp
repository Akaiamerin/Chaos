#include "judge.h"

bool IsDraw(char board[ROW][COL], int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

bool IsWin(char board[ROW][COL], int row, int col) {
    //三行
    for (int i = 0; i < row; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] != ' ') {
            return true;
        }
    }
    //三列
    for (int i = 0; i < col; i++) {
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != ' ') {
            return true;
        }
    }
    //主对角线
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ') {
        return true;
    }
    //次对角线
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ') {
        return true;
    }
    return false;
}