#include <stdio.h>
#include <string.h>

int main() {
    int x, y, n;
    scanf("%i %i %i", &x, &y, &n);
    int arr[x][y];
    memset(arr, 0, sizeof(arr));
    for (int i = 1; i <= n; i++) {
        int ix, iy;
        scanf("%i %i", &ix, &iy);
        arr[ix - 1][iy - 1] = i;
    }
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++)
            printf("%i ", arr[i][j]);
        printf("\n");
    }
}