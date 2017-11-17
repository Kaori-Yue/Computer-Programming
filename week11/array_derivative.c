#include <stdio.h>

void derivative(int *AInput, int *AOutput, const int N);

int main() {
    int n;
    scanf("%i", &n);
    int arr[n];
    int arr2[n];
    for (int i = 0; i < n; i++) {
        arr2[i] = 99;
        scanf("%i", &arr[i]);
    }
    derivative(arr, arr2, n);
    for (int i = 0; i < n; i++)
        printf("%i ", arr2[i]);
}

void derivative(int *AInput, int *AOutput, const int N) {
    for (int i = 0; i < N; i++) {
        if (i == 0) {
            *(AOutput + i) = 0;
            continue;
        }
        *(AOutput + i) = *(AInput + i) - *(AInput + (i - 1));
    }
}