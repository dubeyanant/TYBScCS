#include <stdio.h>
#include <stdlib.h>
int main()
{
	int RQ[100], i, n, TotHeaderMov = 0, initial;

	printf("\nEnter no of requests : ");
	scanf("%d", &n);
	printf("\nEnter the requests sequence : ");
	for (i = 0; i < n; i++)
		scanf("%d", &RQ[i]);
	printf("\nEnter initial head position : ");
	scanf("%d", &initial);

	for (i = 0; i < n; i++)
	{
		TotHeaderMov = TotHeaderMov + abs(RQ[i] - initial);
		initial = RQ[i];
	}

	printf("\nTotal head moment is : %d \n", TotHeaderMov);
	return 0;
}