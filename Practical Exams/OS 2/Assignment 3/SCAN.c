#include <stdio.h>
#include <stdlib.h>
int main()
{
	int RQ[100], i, j, n, TotHeaderMov = 0, initial;
	int size, move, temp, index;

	printf("\nEnter no of requests : ");
	scanf("%d", &n);

	printf("\nEnter the requests sequence : ");
	for (i = 0; i < n; i++)
		scanf("%d", &RQ[i]);

	printf("\nEnter initial head position : ");
	scanf("%d", &initial);
	printf("\nEnter total disk size : ");
	scanf("%d", &size);
	printf("Enter movement towards high(1) or low(0) : \n");
	scanf("%d", &move);

	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n - i - 1; j++)
		{
			if (RQ[j] > RQ[j + 1])
			{
				temp = RQ[j];
				RQ[j] = RQ[j + 1];
				RQ[j + 1] = temp;
			}
		}
	}

	for (i = 0; i < n; i++)
	{
		if (initial < RQ[i])
		{
			index = i;
			break;
		}
	}

	if (move == 1)
	{
		for (i = index; i < n; i++)
		{
			TotHeaderMov = TotHeaderMov + abs(RQ[i] - initial);
			initial = RQ[i];
		}
		TotHeaderMov = TotHeaderMov + abs(size - RQ[i - 1] - 1);
		initial = size - 1;

		for (i = index - 1; i >= 0; i--)
		{
			TotHeaderMov = TotHeaderMov + abs(RQ[i] - initial);
			initial = RQ[i];
		}
	}
	else
	{
		for (i = index - 1; i >= 0; i--)
		{
			TotHeaderMov = TotHeaderMov + abs(RQ[i] - initial);
			initial = RQ[i];
		}
		TotHeaderMov = TotHeaderMov + abs(size - RQ[i + 1] - 0);
		initial = 0;

		for (i = index; i < n; i++)
		{
			TotHeaderMov = TotHeaderMov + abs(RQ[i] - initial);
			initial = RQ[i];
		}
	}

	printf("Total Movement is : %d", TotHeaderMov);
	return 0;
}