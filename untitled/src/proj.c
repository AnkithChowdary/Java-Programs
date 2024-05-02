#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ROWS 3
#define COLS 3

void print_board(int board[ROWS][COLS]) {
    printf("\n");
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            printf("%d ", board[i][j]);
        }
        printf("\n");
    }
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void shuffle(int board[ROWS][COLS]) {
    srand(time(NULL));
    for (int i = ROWS - 1; i > 0; i--) {
        for (int j = COLS - 1; j > 0; j--) {
            int k = rand() % (i + 1);
            int l = rand() % (j + 1);
            swap(&board[i][j], &board[k][l]);
        }
    }
}

int check_win(int board[ROWS][COLS]) {
    int count = 1;
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            if (board[i][j] != count) {
                return 0;
            }
            count++;
        }
    }
    return 1;
}

int main() {
    int board[ROWS][COLS] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    shuffle(board);
    printf("Welcome to the Puzzle Game!\n");
    printf("The objective of the game is to arrange the numbers in ascending order.\n");
    printf("Here is your starting board:\n");
    print_board(board);
    while (!check_win(board)) {
        int row, col;
        printf("Enter the row and column of the number you want to move: ");
        scanf("%d %d", &row, &col);
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            printf("Invalid input. Please try again.\n");
            continue;
        }
        if (board[row][col] == 0) {
            printf("Invalid move. Please try again.\n");
            continue;
        }
        if (row > 0 && board[row - 1][col] == 0) {
            swap(&board[row][col], &board[row - 1][col]);
        } else if (row < ROWS - 1 && board[row + 1][col] == 0) {
            swap(&board[row][col], &board[row + 1][col]);
        } else if (col > 0 && board[row][col - 1] == 0) {
            swap(&board[row][col], &board[row][col - 1]);
        } else if (col < COLS - 1 && board[row][col + 1] == 0) {
            swap(&board[row][col], &board[row][col + 1]);
        } else {
            printf("Invalid move. Please try again.\n");
            continue;
        }
        print_board(board);
    }
    printf("Congratulations! You have won the game!\n");
    return 0;
}
