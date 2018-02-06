#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

int compare (const void * a, const void * b);

int main() {
    int  userScore[4], Max = INT_MIN, StuID, StuID_Max, StuI = 1;
    unsigned short int arr_length = sizeof(userScore) / sizeof(int), result = 0;
    while(1) {
        scanf("%i", &StuID);
        if (StuID < 0) break;
        scanf("%i", &userScore[0]);
        scanf("%i %i %i", &userScore[1], &userScore[2], &userScore[3]);
        qsort(userScore, 4, sizeof(int), compare);
        for (int i=0; i<arr_length - 1; i++) {
          result += userScore[i];
        }
        if (result >= Max) {
            if (result == Max) StuI++;
            else StuI = 1;
            Max = result;
            StuID_Max = StuID;
        }
        result = 0;
    }
    // printf("S: %i\n", StuI);
    if (StuI <= 1) printf("%i\n%i", StuID_Max, Max);
    else printf("%i*\n%i", StuI, Max);
}

int compare (const void * a, const void * b) {
    return ( *(int*)b - *(int*)a );
 }