#include <stdio.h>

int main() {
    int n = 5;//, c1 = 5, c2 = 13, c3 = 6;
    scanf("%i", &n);
    // int c1 = n, c2 = n*2+3, c3= n+1; // 8 = +6 // 5 = +3
    int c1 = n, c2 = n*2+(n-2), c3= n+1;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=(n*2)-1; j++) {
            if (j == 1)
                printf("%i", (c1--)%10);
            else if ( j == (n*2)-1)
                printf("%i", (c2--)%10);
            else if ((i*2)-1 == j)
                printf("%i", (c3++)%10);
            else
                printf(" ");
        }
        printf("\n");
    }
}

// int main() {
//     int n = 5, count = 1;
//     // scanf("%i", &n);
//     for(int i=1; i<=n; i++) {
//         for(int j=1; j<=(n*2)-1; j++) {
//             if (j==1 || j == (n*2)-1 || (i*2)-1 == j) {
//                 printf("%i", i);
//             }
//             else
//                 printf(" ");
//         }
//         printf("\n");
//     }
// }