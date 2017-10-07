#include <stdio.h>

int main() {
    int minScore[4], userScore[4], minSubject = 3, userSubject = 0, userExam, pass_Subject = 0, passUser[4] = {0, 0, 0, 0};

    for(int i=0; i<4; i++) {
        scanf("%i", &minScore[i]);
    }
    scanf("%i", &userExam);

    for (int j=0; j<userExam; j++) {
        for(int i=0; i<4; i++) {
            scanf("%i", &userScore[i]);
        }
        pass_Subject = 0;
        for(int i=0; i<4; i++) {
            if (userScore[i] >= minScore[i]) {
                // printf("%i ", i + 1);
                pass_Subject++;
                passUser[i]++;
            }
        }
        if (pass_Subject >= 3) {
            printf("pass\n");
            userSubject++;
        }
        else printf("fail\n");
        // if(userSubject >= minSubject) printf("\npass");
        // else if (userSubject == 0) printf("0\nfail");
        // else printf("\nfail");
    }
    printf("%i\n", userSubject);
    for (int i=0; i<4; i++) printf("%i ", passUser[i]);
}