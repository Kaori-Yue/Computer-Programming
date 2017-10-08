#include <stdio.h>
int compare (const void * a, const void * b);

int main() {
    int  userScore[4], result = 0;
    unsigned short int arr_length = sizeof(userScore) / sizeof(int);
    scanf("%i %i %i %i", &userScore[0], &userScore[1], &userScore[2], &userScore[3]);
    qsort(userScore, 4, sizeof(int), compare);
    
    for (int i=0; i<arr_length - 1; i++) {
      result += userScore[i];
      // printf("%i\n", userScore[i]);
    }
    printf("%i", result);
}

int compare (const void * a, const void * b) {
    return ( *(int*)b - *(int*)a );
 }