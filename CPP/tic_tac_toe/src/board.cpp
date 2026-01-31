#include <iostream>
#include "board.h"

void InitBoard(char board[ROW][COL], int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            board[i][j] = ' ';
        }
    }
}

void OutputBoard(char board[ROW][COL], int row, int col) {
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            std::cout << " " << board[i][j] << " ";
            if (j < col - 1) {
                std::cout << "|";
            }
        }
        std::cout << std::endl;
        if (i < row - 1) {
            for (int j = 0; j < col; j++) {
                std::cout << "———";
                if (j < col - 1) {
                    std::cout << "|";
                }
            }
            std::cout << std::endl;
        }
    }
}