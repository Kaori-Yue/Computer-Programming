#include <stdio.h>

int main() {
    double x[3];
    scanf("%lf %lf %lf", &x[0] ,&x[1], &x[2]);
    printf("%.2f %.2f %.2f", x[2], x[1], x[0]);
}