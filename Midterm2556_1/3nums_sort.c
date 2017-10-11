#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b);

int main() {
    int x[3];
    scanf("%i %i %i", &x[0], &x[1], &x[2]);
    qsort(x, 3, 4, compare);
    printf("%i %i %i", x[0], x[1], x[2]);
}

int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}