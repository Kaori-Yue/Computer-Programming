#include <stdio.h>

// function
char Grade(int score);
void showAllScores();
void showAllGrades();
void showStudentScores();
void showStudentGrade();
void cheangeName();
void changeScore();

// typedef
struct {
    int id;
    char name[52];
    int score[5];
} typedef STUDENT;

// global for ez
STUDENT students[100];
int index = 0;

int main() {
    while (1) {
        int id;
        scanf("%i", &id);
        if (id == 0)
            break;
        students[index].id = id;
        scanf("%s", students[index].name);
        for (int i = 0; i < 5; i++)
            scanf("%i", &students[index].score[i]);
        index++;
    }
    printf("Number of Students %i\n", index);
    showAllScores();
    showAllGrades();
    int command;
    while (1) {
        scanf("%i", &command);
        if (command == 0)
            break;
        switch (command) {
        case 1:
            showAllScores();
            break;
        case 2:
            showAllGrades();
            break;
        case 3:
            showStudentScores();
            break;
        case 4:
            showStudentGrade();
            break;
        case 5:
            cheangeName();
            break;
        case 6:
            changeScore();
            break;
        default:
            break;
        }
    }
    return 0;
}

void showAllScores() {
    printf("Scores\n");
    for (int i = 0; i < index; i++) {
        printf("%i %s ", students[i].id, students[i].name);
        for (int j = 0; j < 5; j++)
            printf("%i ", students[i].score[j]);
        printf("\n");
    }
}

void showAllGrades() {
    printf("Grades\n");
    for (int i = 0; i < index; i++) {
        printf("%i %s ", students[i].id, students[i].name);
        for (int j = 0; j < 5; j++)
            printf("%c ", Grade(students[i].score[j]));
        printf("\n");
    }
}

void showStudentScores() {
    int id;
    scanf("%i", &id);
    for (int i = 0; i < index; i++) {
        if (students[i].id == id) {
            printf("%i %s ", students[i].id, students[i].name);
            for (int j = 0; j < 5; j++)
                printf("%i ", students[i].score[j]);
            printf("\n");
        }
    }
}

void showStudentGrade() {
    int id;
    scanf("%i", &id);
    for (int i = 0; i < index; i++) {
        if (students[i].id == id) {
            printf("%i %s ", students[i].id, students[i].name);
            for (int j = 0; j < 5; j++)
                printf("%c ", Grade(students[i].score[j]));
            printf("\n");
        }
    }
}

void cheangeName() {
    int id;
    scanf("%i", &id);
    for (int i = 0; i < index; i++) {
        if (students[i].id == id) {
            scanf("%s", students[i].name);
        }
    }
}

void changeScore() {
    int id;
    scanf("%i", &id);
    for (int i = 0; i < index; i++) {
        if (students[i].id == id) {
            int score_nonindex, new_score;
            scanf("%i %i", &score_nonindex, &new_score);
            students[i].score[score_nonindex - 1] = new_score;
        }
    }
}

char Grade(int score) {
    char grade;
    if (score >= 80)
        grade = 'A';
    else if (score >= 70)
        grade = 'B';
    else if (score >= 60)
        grade = 'C';
    else if (score >= 50)
        grade = 'D';
    else
        grade = 'F';
    return grade;
}