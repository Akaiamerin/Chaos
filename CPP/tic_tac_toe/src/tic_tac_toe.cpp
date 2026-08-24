#include <iostream>
#include <limits>
#include <ctime>
#include "menu.h"
#include "board.h"
#include "move.h"
#include "judge.h"
#include "tic_tac_toe.h"

void PlayGame() {
    char board[ROW][COL];
    InitBoard(board, ROW, COL);
    OutputBoard(board, ROW, COL);
    while (true) {
        PlayerMove(board, ROW, COL);
        std::system("cls");
        OutputBoard(board, ROW, COL);
        if (IsWin(board, ROW, COL) == true) {
            std::cout << "玩家胜利" << std::endl;
            break;
        }
        if (IsDraw(board, ROW, COL) == true) {
            std::cout << "平局" << std::endl;
            break;
        }
        AIMove(board, ROW, COL);
        std::system("cls");
        OutputBoard(board, ROW, COL);
        if (IsWin(board, ROW, COL) == true) {
            std::cout << "电脑胜利" << std::endl;
            break;
        }
        if (IsDraw(board, ROW, COL) == true) {
            std::cout << "平局" << std::endl;
            break;
        }
    }
}

void ChoiceOpt() {
    while (true) {
        GameMenu();
        int opt = 0;
        std::cin >> opt;
        if (opt == GameOptEnum::begin_game) {
            std::system("cls");
            PlayGame();
        }
        else if (opt == GameOptEnum::exit_game) {
            std::system("cls");
            break;
        }
        else {
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            std::system("cls");
        }
    }
}

int main() {
    srand((unsigned)time(NULL));
    ChoiceOpt();
    return 0;
}