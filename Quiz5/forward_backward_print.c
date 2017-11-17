#include <stdio.h>

int main() {
    int n, x;
    scanf("%i", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%i", &arr[i]);
    scanf("%i", &x);
    if (x >= 0) {
        for (int i = 0; i < n; i++)
            printf("%i ", arr[i] + x);
    } else {
        for (int i = n - 1; i >= 0; i--)
            printf("%i ", arr[i] + x);
    }
}