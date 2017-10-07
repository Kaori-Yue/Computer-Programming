#include <stdio.h>
// #include <math.h>

int main() {
    int k, n, remain = 0, x;
    scanf("%i", &k);
    k *= 100;
    scanf("%i", &n);
    while (n >= 1) {
        scanf("%i", &x);
        remain += x;
        printf("%i\n", (remain + k -1)/k);
        // printf("%.0f\n", ceil((float)remain / k));
        n--;
    }
}