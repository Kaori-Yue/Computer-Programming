#include <stdio.h>

typedef struct {
    int code;
    char name[52];
    int level[8];
} POKEMON;

int main() {
    int n, k;
    scanf("%i", &n);
    POKEMON monster[n];
    for (int i = 0; i < n; i++) {
        scanf("%i %s", &monster[i].code, monster[i].name);
        for (int j = 0; j < 8; j++)
            scanf("%i", &monster[i].level[j]);
    }
    scanf("%i", &k);
    int res[k][2]; // code, level
    for (int i = 0; i < k; i++)
        scanf("%i %i", &res[i][0], &res[i][1]);
    for (int i = 0; i < k; i++) {
        for (int j = 0; j < n; j++) {
            if (monster[j].code == res[i][0]) {
                printf("%s %i\n", monster[j].name, monster[j].level[res[i][1] - 1]);
                break;
            }
        }
    }

    // for (int i = 0; i < k; i++) {
    //     int fcode, flv;
    //     scanf("%i %i", &fcode, &flv);
    //     for (int j = 0; j < n; j++) {
    //         if (monster[j].code == fcode) {
    //             // printf("%s %i", monster[j].name, monster[j].level[flv - 1]);
    //             break;
    //         }
    //     }
    // }
}
