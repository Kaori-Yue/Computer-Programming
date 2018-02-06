#include <stdio.h>

int main() {
    int Days, minDays = 3, x, income = 0, prev = 0;
    // printf("%i\n", Salary(13));
    scanf("%i", &Days);
    
    for (int i=1; i<=Days; i++) {
        scanf("%i", &x);
        if (x < 4 && prev == x) minDays--;
        if (minDays == 0) break;
        income += Salary(x);
        // printf("%i => %i => %i\n", i, Salary(x), income);
        prev = x;
    }
    printf("%i", income);
}

int Salary(int hours) {
    int cost;
    if (hours >= 8) 
      if (hours > 12) cost = 300 + ((12 - 8) * 50);
      else cost = 300 + ((hours - 8) * 50);
    if (hours >= 4 && hours < 8) cost = 150;
    if (hours < 4) cost = 0;
    return cost;
}