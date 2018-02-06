#include <stdio.h>

int main() {
    int n, x, notfound = 0, index = 0, sum = 0;
    scanf("%i", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%i", &x);
        notfound = 0;
        for (int j = 0; j < index; j++)
            if (arr[j] == x)
                notfound++;
        if (notfound != 1) {
            arr[index++] = x;
            sum += x;
        }
    }
    printf("%i\n%i", index, sum);
}