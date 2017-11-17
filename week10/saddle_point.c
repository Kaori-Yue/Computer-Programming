#include <stdio.h>

int main() {
    int x, y;
    scanf("%i %i", &x, &y);
    int arr[x][y];

    for (int i = 0; i < x; i++)
        for (int j = 0; j < y; j++)
            scanf("%i", &arr[i][j]);

    for (int i = 0; i < x; i++) {
    }
}