#include <stdio.h>
#include <string.h>

int main() {
    int x, y, n;
    scanf("%i %i %i", &x, &y, &n);
    int arr[x][y];
    memset(arr, -1, sizeof(arr));
    for (int i = 0; i < n; i++) {
        int cx, cy;
        scanf("%i %i", &cx, &cy);
        arr[cx - 1][cy - 1] = 0;
    }
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) 
			printf("%c", arr[i][j] == 0 ? 'x' : '_');
        printf("\n");
    }
}