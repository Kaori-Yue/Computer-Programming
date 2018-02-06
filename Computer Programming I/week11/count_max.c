#include <limits.h>
#include <stdio.h>

int countMax(int *arData, int N);

int main() {
    int n;
    scanf("%i", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%i", &arr[i]);
    printf("%i", countMax(arr, n));
}

int countMax(int *arData, int N) {
    int max = INT_MIN;
    int count = 0;
    for (int i = 0; i < N; i++) {
        if (max < *(arData + i))
            max = *(arData + i);
    }
    for (int i = 0; i < N; i++) {
        if (max == *(arData + i))
            count++;
    }
    return count;
}