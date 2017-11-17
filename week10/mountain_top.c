#include <stdbool.h>
#include <stdio.h>

int main() {
    int n;
    scanf("%i", &n);
    int arr[n][n], count = 0;

    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%i", &arr[i][j]);

    int result[1000][2];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i][j] > arr[i - 1][j - 1] && arr[i][j] > arr[i - 1][j] &&
                arr[i][j] > arr[i - 1][j + 1] && arr[i][j] > arr[i][j - 1] &&
                arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j - 1] &&
                arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i + 1][j + 1]) {
                result[count][0] = i;
                result[count][1] = j;
                // result[count][2] = arr[i][j];
                // printf("%i %i %i %i\n", arr[i][j], i, j, count);
                count++;
            }
        }
    }
    printf("%i\n", count);
    for (int i = 0; i < count; i++) {
        printf("%i %i %i\n", arr[result[i][0]][result[i][1]], result[i][0], result[i][1]);
    }
}