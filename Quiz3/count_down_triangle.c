#include <stdio.h>

int main() {
    int n;
    scanf("%i", &n);
    
    for (int i=n; i>=1; i--) {
        for (int j=1; j<=n; j++) {
          if (i >= n-j+1) printf("%i", i > 9 ? i % 10 : i);
          else printf (" ");
        }
        printf("\n");
    }
}