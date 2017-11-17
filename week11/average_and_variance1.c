#include <math.h>
#include <stdio.h>

double average(int *array);
double variance(int *array, double avg);

int main() {
    int arr[8];
    for (int i = 0; i < 8; i++)
        scanf("%i", &arr[i]);
    printf("%.2f %.2f", average(arr), variance(arr, average(arr)));
}

double average(int *array) {
    double avg = 0;
    for (int i = 0; i < 8; i++) {
        avg += *(array + i);
    }
    return avg / 8;
}

double variance(int *array, double avg) {
    double s = 0;
    for (int i = 0; i < 8; i++) {
        s += pow((*(array + i) - avg), 2);
    }
    return s / 7;
}