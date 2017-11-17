#include <stdio.h>

int main() {
    int n, x;
    scanf("%i", &n);
    int arr[n][n];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%i", &arr[i][j]);
    scanf("%i", &x);
    if (x == 1) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= (n / 2) - 1)
                    printf("%i ", arr[i][j + (n/2)]);
                else
                    printf("%i ", arr[i][j - (n/2)]);
            }
            printf("\n");
        }
    } else {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= (n / 2) - 1)
                    printf("%i ", arr[i + (n/2)][j]);
                else
                    printf("%i ", arr[i - (n/2)][j]);
            }
            printf("\n");
        }
    }
}