#include <math.h>
#include <stdio.h>

double average(int *array, int size);
double variance(int *array, double avg, int size);

int main() {
    int n;
    scanf("%i", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%i", &arr[i]);
    printf("%.2f %.2f", average(arr, n), variance(arr, average(arr, n), n));
}

double average(int *array, int size) {
    double avg = 0;
    for (int i = 0; i < size; i++) {
        avg += *(array + i);
    }
    return avg / size;
}

double variance(int *array, double avg, int size) {
    double s = 0;
    for (int i = 0; i < size; i++) {
        s += pow((*(array + i) - avg), 2);
    }
    return s / (size - 1);
}