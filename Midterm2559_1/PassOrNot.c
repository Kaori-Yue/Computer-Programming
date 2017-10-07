#include <stdio.h>

int main() {
    int minScore[4], userScore[4], minSubject = 3, userSubject = 0;

    for(int i=0; i<4; i++) {
        scanf("%i", &minScore[i]);
    }

    for(int i=0; i<4; i++) {
        scanf("%i", &userScore[i]);
    }

    for(int i=0; i<4; i++) {
        if (userScore[i] >= minScore[i]) {
            printf("%i ", i + 1);
            userSubject++;
        }
    }
    if(userSubject >= minSubject) printf("\npass");
    else if (userSubject == 0) printf("0\nfail");
    else printf("\nfail");
}