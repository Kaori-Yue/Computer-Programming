#include <limits.h>
#include <stdbool.h>
#include <stdio.h>
#include <limits.h>
/*
3 4
1 2 3 3
9 5 6 7
7 4 9 2
*/
/*
3 3
1 2 3
4 5 6
7 8 9
*/
int main() {
    int x, y;
    scanf("%i %i", &x, &y);
    int arr[x][y];
    bool checker = false;

    for (int i = 0; i < x; i++)
        for (int j = 0; j < y; j++)
            scanf("%i", &arr[i][j]);

    for (int i = 0; i < x; i++) {
        //int state = 0; // 0 nothing // 1 max // 2 min
        for (int j = 0; j < y; j++) {
            int cmin, cmax, rmin, rmax, curr = arr[i][j];
            cmin = rmin = INT_MAX;
            cmax = rmax = INT_MIN;
                        // col
            for (int k = 0; k < y; k++) {
                if (j == k)
                    continue;
                if (cmin > arr[i][k])
                    cmin = arr[i][k];
                if (cmax < arr[i][k])
                    cmax = arr[i][k];
            }
            // row
            for (int k = 0; k < x; k++) {
                if (i == k)
                    continue;
                if (rmin > arr[k][j])
                    rmin = arr[k][j];
                if (rmax < arr[k][j])
                    rmax = arr[k][j];
            }
            //printf("i: %i j: %i cmin: %i cmax: %i rmin: %i rmax: %i curr: %i\n", i,j,cmin,cmax,rmin,rmax, curr);
            if ((curr >= rmax && curr <= cmin) || (curr >= cmax && curr <= rmin)) {
                //if ((curr >= cmax && curr < rmin))
                printf("(%i, %i) = %i\n", i, j, curr);
                checker = true;
            }
        }
        //printf("\n");
    }
    if (!checker)
        printf("None");
}