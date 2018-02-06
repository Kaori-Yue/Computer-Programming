#include <stdio.h>

int main() {
    int k, n, spoint = 0, ipoint = 0;
    scanf("%d %d", &n, &k);
    int arr[n + 1];
    for (int i = 1; i <= n; i++) {
        arr[i] = 0;
    }
    for (int i = 1; i <= k; i++) {
        int x;
        scanf("%i", &x);
        arr[x]++;
    }
    for (int i = 1; i <= n; i++) {
        if (spoint < arr[i]) {
            spoint = arr[i];
            ipoint = i;
        }
    }
    printf("%i\n%i\n", ipoint, spoint);
}