#include <stdio.h>

int main() {
   int x, c = 1;
   scanf("%i", &x);

   for(int i=1; i<=x; i++) {
       for(int j=1; j<c; j++) {
           printf(" ");
       }
       for(int j=1; j<=x/3; j++) {
           printf("*  ");
       }
       printf("\n");
       c++;
       if (c==4) c=1;
   }
}