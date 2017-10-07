#include <stdio.h>
#include <limits.h>

int main() {
    int x,
        min = INT_MAX,
        max = INT_MIN;
        
    while (1) {
        scanf("%i", &x);
        if (x <= 0) break;
        if (x < min)
            if (x % 2 == 1)
                min = x;
        if (x > max)
            if (x % 2 == 1)
                max = x;
    }
    printf("%i\n%i\n%i",max, min, (max - min));
}