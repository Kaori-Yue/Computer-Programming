#include <stdio.h>

// Why use array ?
int main() {
    int n, x, up = 0, down = 0;
    scanf("%i", &n);
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) {
            scanf("%i", &x);
            if (i > j)
                down += x;
            if (i < j)
                up += x;
        }
    printf("%i\n%i", up, down);
}