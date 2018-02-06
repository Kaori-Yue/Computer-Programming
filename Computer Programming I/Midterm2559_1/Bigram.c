#include <stdio.h>

int main() {
    int x, 
        prev = 2, // Any number but not eq 0 and 1
        A = 0, // 00
        B = 0, // 01
        C = 0, // 10
        D = 0; // 11
    while (1) {
        scanf("%i", &x);
        if (x != 0 && x != 1) break;
        if (prev == 0 && x == 0) A++;
        if (prev == 0 && x == 1) B++;
        if (prev == 1 && x == 0) C++;
        if (prev == 1 && x == 1) D++;
        prev = x;
    }
    printf("%i\n%i\n%i\n%i", A, B, C, D);
}