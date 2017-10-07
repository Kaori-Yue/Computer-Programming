#include <stdio.h>

int main() {
    int x, y, z;
    int x_divide = 0, y_divide = 0, all_divide = 0;
    scanf("%i %i", &x, &y);

    while (1) {
        scanf("%i", &z);
        if (z <= 0) break;

        if (z % x == 0 && z % y != 0) x_divide += z;
        if (z % y == 0 && z % x != 0) y_divide += z;
        if (z % x == 0 || z % y == 0) all_divide += z;
    }
    printf("%i\n%i\n%i", x_divide, y_divide, all_divide);
}