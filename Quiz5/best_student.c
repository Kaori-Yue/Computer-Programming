#include <stdio.h>

typedef struct Studens {
    char ID[9];
    char Name[31];
    char LastName[51];
    float Grade;
} Studens;

int main() {
    int n, index = -1;
    float grade_h = -1;
    scanf("%i", &n);
    Studens studens[n];
    for (int i = 0; i < n; i++) {
        scanf("%s %s %s %f", &studens[i].ID, &studens[i].Name, &studens[i].LastName, &studens[i].Grade);
        if (studens[i].Grade > grade_h) {
            grade_h = studens[i].Grade;
			index = i;
		}
    }
	printf("%s %s %s %.2f", studens[index].ID, studens[index].Name, studens[index].LastName, studens[index].Grade);
}