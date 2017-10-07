#include <stdio.h>

int main() {
    int x, y, income = 0, outcome = 0;
    while(1) {
        scanf("%i %i", &x, &y);
        if (x == 0 && y == 0) break;
        if (x == 1) {
            // income
            income +=y;
        } else {
            outcome +=y;
        }
    }
    if (income - outcome < 0) {
        printf("Bad\n%i", abs(income - outcome));
    } else {
        printf("Good\n%i", income - outcome);
    }
}