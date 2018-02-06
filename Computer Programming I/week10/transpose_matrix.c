#include <stdio.h>

int main() {
	int x, y;
	scanf("%i %i", &x, &y);
	int matrix[x][y];
	
	for(int i=0; i<x; i++)
		for(int j=0; j<y; j++)
			scanf("%i", &matrix[i][j]);
	for(int i=0; i<y; i++) {
		for(int j=0; j<x; j++)
			printf("%i ", matrix[j][i]);
		printf("\n");
	}
}