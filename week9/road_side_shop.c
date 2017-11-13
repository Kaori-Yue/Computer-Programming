#include <stdio.h>

int main() {
	int n,k;
	int max = 0;
	scanf("%i %i", &n, &k);
	int length[n];
	for (int i=0; i<n; i++) scanf("%i", &length[i]);

	for(int i=0; i<n; i++) {
		if (i == n - k) break;
		if (i < k) continue;
		//printf("FF: %i | ", i+1);
		int temp = 0;
		for(int j=i; j<=i+k; j++) temp += length[j];//printf("F: %i ", j);
		//printf("%i ", i);
		for(int j=i-k; j<i; j++) temp += length[j];//printf("L: %i ", j);
		//printf("\n");
		//printf("%i ", i);
		if (max < temp) max = temp;
	}
	printf("%i", max);
}