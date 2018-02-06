#include <stdio.h>
#include <string.h>

typedef struct {
    int arr[1000];
    int size;
} ARR;

int main() {
    int n, err = 0, sum = 0, min = 1024, max = -1024;
    scanf("%i", &n);
    ARR arr[n];
    //memset(&arr, 0, sizeof(arr));
    for (int i = 0; i < n; i++) {
        int k;
        scanf("%i", &k);
        arr[i].size = k;
        for (int j = 0; j < k; j++) {
            int x;
            scanf("%i", &x);
            arr[i].arr[j] = x;
        }
    }
    while (1) {
        int a, p;
        scanf("%i", &a);
        if (a == 0)
            break;
        scanf("%i", &p);
        if (a <= n)
            if (arr[a - 1].size > p) {
                int curr = arr[a - 1].arr[p];
                sum += curr;
                if (curr > max)
                    max = curr;
                if (curr < min)
                    min = curr;
            } else
                err++;
        else
            err++;
    }
    printf("%i\n%i\n%i\n%i", sum, max, min, err);
    return 0;
}