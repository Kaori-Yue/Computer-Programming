#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

int compare (const void * a, const void * b);

int main() {
    int  userScore[4], max = INT_MIN;
    unsigned short int arr_length = sizeof(userScore) / sizeof(int), result = 0;
    while(1) {
        scanf("%i", &userScore[0]);
        if (userScore[0] < 0) break;
        scanf("%i %i %i", &userScore[1], &userScore[2], &userScore[3]);
        qsort(userScore, 4, sizeof(int), compare);
        for (int i=0; i<arr_length - 1; i++) {
          result += userScore[i];
        }
        if (result > max) max = result;
        result = 0;
    }
    printf("%i", max);
}

int compare (const void * a, const void * b) {
    return ( *(int*)b - *(int*)a );
 }