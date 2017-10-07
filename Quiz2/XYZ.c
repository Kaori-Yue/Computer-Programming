#include <stdio.h>

int main() {
    int i, x, y, z;
    scanf("%i", &i);
    while (i >= 1) {
        scanf("%i %i %i",&x ,&y ,&z);
        if (x > y && x > z && y != z) printf("x");
        if (y > x && y > z && x != z) printf("y");
        if (z > x && z > y && x != y) printf("z");
        if (x == y && x < z) printf("xy");
        if (x == y && x > z) printf("xy");
        if (y == z && y < x) printf("yz");
        if (y == z && y > x) printf("yz");
        if (x == z && x < y) printf("xz");
        if (x == z && x > y) printf("xz");
        if (x == y && x == z) printf("xyz");
        printf("\n");
        i--;
    }
}