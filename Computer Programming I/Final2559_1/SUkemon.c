#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%i", &n);
    int arr[2][n];
    memset(arr, 0, sizeof(arr));
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < n; j++)
            scanf("%i", &arr[i][j]);

    int it1 = 0, it2 = 0;
    while (1) {
        if (it1 == n || it2 == n)
            break;
        // printf("1: %i | 2: %i\n", it1, it2);
        int dmg1 = arr[0][it1];
        int dmg2 = arr[1][it2];

        int hp1 = dmg1 - dmg2;
        int hp2 = dmg2 - dmg1;
        // printf("hp1: %i | hp2: %i\n", hp1, hp2);
        if (hp1 <= 0 && hp2 <= 0) {
            printf("0\n");
            it1++;
            it2++;
        } else if (hp1 <= 0) {
            printf("2\n");
            arr[1][it2] = hp2;
            it1++;
        } else {
            printf("1\n");
            arr[0][it1] = hp1;
            it2++;
        }
    }
}