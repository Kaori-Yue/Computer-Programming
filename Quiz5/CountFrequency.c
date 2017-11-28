#include <stdio.h>
#include <string.h>

int main() {
    int n, count = 0;
    scanf("%i", &n);
    int arr[n][2]; // 0 = number | 1 = counter
    memset(arr, 0, sizeof(arr));
    for (int i = 0; i < n; i++) {
        int x;
        scanf("%i", &x);
        int nonfound = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j][0] != x)
                nonfound++;
            else
                arr[j][1]++;
        }
        if (nonfound == n) {
            arr[count][0] = x;
            arr[count][1]++;
            count++;
        }
    }
    printf("%i\n", count);
    for (int i = 0; i < count; i++)
        printf("%i %i\n", arr[i][0], arr[i][1]);
}