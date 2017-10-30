#include <stdio.h>

int main() {
    int x;
    scanf("%i", &x);

    for (int i=1; i<=x; i++) {
        for (int j=1; j<=x; j++) {
            if (i == 1 || i == x || j == 1 || j == x || i >= 3 && i <= x-2 && j > 2 && j < x -1 || i == x - 2 && j > 2 && j < x-1 ) {
              printf("*");
            } else printf(" "); 
        }
        printf("\n");
    }
}