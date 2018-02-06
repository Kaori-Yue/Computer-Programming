#include <stdio.h>


int main() {
    int n, count = 0;
    scanf("%i", &n);
    int arr[n][n];
    int arr2[1000000][2]; // 0 = i | 1 = j
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%i", &arr[i][j]);

    for (int i = 1; i < n - 1; i++) {
        for (int j = 1; j < n - 1; j++) {
            int highest = 0;
            for (int p = i - 1; p <= i + 1; p++) {
                for (int q = j - 1; q <= j + 1; q++) {
                    if (arr[i][j] > arr[p][q])
                        highest++;
                }
            }
            if (highest == 8) {
                //printf("%i %i %i\n", arr[i][j], i, j);
                arr2[count][0] = i;
                arr2[count][1] = j;
                count++;
            }
        }
    }
    printf("%i\n", count);
    for (int i = 0; i < count; i++)
        printf("%i %i %i\n", arr[arr2[i][0]][arr2[i][1]], arr2[i][0], arr2[i][1]);
}


/*
int main() {
    int n;
    scanf("%i", &n);
    int arr[n][n], result[n][2], count = 0;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%i", &arr[i][j]);

    for (int i = 1; i < n - 1; i++) {
        for (int j = 1; j < n - 1; j++) {
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
*/