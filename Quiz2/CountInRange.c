#include <stdio.h>

int main() {
    int x, y, z;
    int less = 0, more = 0, range = 0;
    scanf("%i %i", &x, &y);

    while(1) {
        scanf("%i", &z);
        if (z == 0)
            break;

        if (z > x && z > y)
            more++;
        
        if (z < x && z < y)
            less++;

        if (z > x && z < y || z < x && z > y)
            range++;
    }

    // printf("more: %d\nless: %d", more, less);
    printf("%i\n%i\n%i", range, less, more);
}