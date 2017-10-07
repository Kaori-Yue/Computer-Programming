#include <stdio.h>

int main() {
    int x, y, income = 0, expenditure = 0, income_i = 0, expenditure_i = 0;
    while(1) {
        scanf("%i", &x);
        if (x == 0) break;
        scanf("%i", &y);
        if (x == 1) {
            // 1 = income
            // printf("%hu", y);
            income += y;
            income_i++;
        } else {
            // 2 = expenditure
            expenditure += y;
            expenditure_i++;
        }
    }
    printf("%i %i\n%i %i %i",income_i, expenditure_i, income, expenditure, (income - expenditure));
}