#include <stdio.h>

int main() {
    int k, x;
    int all = 0, k_division = 0, k_sum = 0;
    scanf("%i", &k);
    while(1) {
        scanf("%i", &x);
        if (x == 0) break;
        all++;
        if (x > 0 && x % k == 0) {
            k_division++;
            k_sum += x;
        }
    }
    printf("%i\n%i\n%i", all, k_division, k_sum);
}