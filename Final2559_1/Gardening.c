#include <limits.h>
#include <stdio.h>
#include <string.h>
int main() {
    int x, y, sum = 0;
    scanf("%i %i", &x, &y);
    // int arr[x][y];
    int worker_salary[x][1];
    memset(worker_salary, 0, sizeof(worker_salary));
    for (int i = 0; i < y; i++)
        for (int j = 0; j < x; j++) {
            // scanf("%i", &arr[i][j]);
            int x;
            scanf("%i", &x);
            int salary = x > 10 ? 400 : x * 40;
            worker_salary[j][0] += salary;
            sum += salary;
        }

    int min = INT_MAX, max = -1, wmin, wmax;
    for (int i = 0; i < x; i++) {
        if (min > worker_salary[i][0]) {
            min = worker_salary[i][0];
            wmin = i;
        }
        if (max < worker_salary[i][0]) {
            max = worker_salary[i][0];
            wmax = i;
        }
    }
    printf("%i\n%i\n%i", sum, wmax + 1, wmin + 1);
}