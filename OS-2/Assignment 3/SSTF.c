#include <stdio.h>
#include <stdlib.h>
int main()
{
	int RQ[100], i, n, TotHeaderMov = 0, initial, count = 0, index;

	printf("\nEnter no of requests : ");
	scanf("%d", &n);
	printf("\nEnter the requests sequence : ");
	for (i = 0; i < n; i++)
		scanf("%d", &RQ[i]);
	printf("\nEnter initial head position : ");
	scanf("%d", &initial);

	while (count != n)
	{
		int min = 1000, d;
		for (i = 0; i < n; i++)
		{
			d = abs(RQ[i] - initial);
			if (min > d)
			{
				min = d;
				index = i;
			}
		}
		TotHeaderMov = TotHeaderMov + min;
		initial = RQ[index];
		RQ[index] = 1000;
		count++;
	}

	printf("\nTotal Head Moment : %d\n", TotHeaderMov);
	return 0;
}