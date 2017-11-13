#include <stdio.h>

int main() {
	int x, n=0;
	int range[501];
	for(int i=0; i<500; i++) {
		scanf("%i", &x);
		if (x < 0 || x >= 10) break;
		range[i] = x;
		n++;
	}
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(i+j > n-2) printf("%i", range[i]);
			else printf(" ");
		}
		printf("\n");
	}
}