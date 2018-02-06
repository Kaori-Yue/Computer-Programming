#include <stdbool.h>
#include <stdio.h>

int isUnique(int *arData, int N);

int main() {
    int n;
    scanf("%i", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%i", &arr[i]);

    printf("%i", isUnique(arr, n));
}

int isUnique(int *arData, int size) {
    bool uni = true;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (i != j && *(arData + i) == *(arData + j))
				uni = false;
        }
        if (!uni)
            break;
    }
	return uni ? 1 : 0;
}