#include <stdio.h>

int main() {
    int k, n, x;
    int k_division = 0, k_division_temp = 0, rows;
    scanf("%i", &k);
    scanf("%i", &n);
    for (int i = 1; i<=n; i++) {
        k_division_temp = 0;
        while(1) {
            scanf("%i", &x);
            if (x == 0) break;
            if (x > 0 && x % k == 0) {
                k_division_temp++;
            }
        }
        if (k_division_temp >= k_division) {
            k_division = k_division_temp;
            rows = i;
        }
    }
    printf("%i %i", rows, k_division);
}