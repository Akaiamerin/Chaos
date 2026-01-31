#include <iostream>
#include <limits>
#include "move.h"

void PlayerMove(char board[ROW][COL], int row, int col) {
    std::cout << "请输入坐标：";
    while (true) {
        int x = 0;
        int y = 0;
        std::cin >> x >> y;
        if (x >= 1 && x <= row && y >= 1 && y <= col) {
            if (board[x - 1][y - 1] == ' ') {
                board[x - 1][y - 1] = 'x';
                break;
            }
            else {
                std::cout << "输入的坐标被占用，请重新输入：";
            }
        }
        else {
            std::cout << "输入的坐标错误，请重新输入：";
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        }
    }
}

void AIMove(char board[ROW][COL], int row, int col) {
    while (true) {
        int x = std::rand() % row;
        int y = std::rand() % col;
        if (board[x][y] == ' ') {
            board[x][y] = 'o';
            break;
        }
    }
}