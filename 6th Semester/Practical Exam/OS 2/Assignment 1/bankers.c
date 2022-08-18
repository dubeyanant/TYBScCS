#define true 1
#define false 0

#include <ctype.h>
#include <stdio.h>

int avail[3], work[10], finish[10], safeseq[10];
int max[5][3], alloc[5][3], need[5][3];
int ssi = -1, m = 3, n = 5, i, j;

void main()
{
	printf("\n Total number of resource type: %d", m);
	printf("\n Total number of processes: %d", n);

	int choice = 0;

	while (choice != 5)
	{
		printf("\n1. Accept available\n2. Display allocation and max\n3. Display the contents of need matrix\n4. Safety algorithm\n5. Exit\nEnter choice : ");
		scanf("%d", &choice);

		switch (choice)
		{
		case 1:
			printf("\n Enter available:");
			for (j = 0; j < m; j++)
			{
				scanf("%d", &avail[j]);
			}
			printf("\n Enter maximun demand by each process\n");
			for (i = 0; i < n; i++)
			{
				printf("Process %d: ", i);
				for (j = 0; j < m; j++)
					scanf("%d", &max[i][j]);
			}
			printf("\n\n Enter allocation by each process\n");
			for (i = 0; i < n; i++)
			{
				printf("Process %d: ", i);
				for (j = 0; j < m; j++)
					scanf("%d", &alloc[i][j]);
			}

			break;

		case 2:
			printf("\n Maximum demand by each process\n");
			for (i = 0; i < n; i++)
			{
				printf("Process %d: ", i);
				for (j = 0; j < m; j++)
					printf("%d\t", max[i][j]);
				printf("\n");
			}

			printf("\n\n Allocation by each process\n");
			for (i = 0; i < n; i++)
			{
				printf("Process %d: ", i);
				for (j = 0; j < m; j++)
					printf("%d\t", alloc[i][j]);
				printf("\n");
			}

			break;

		case 3:
			printf("\n\n Need by each process\n");
			for (i = 0; i < n; i++)
			{
				printf("Process %d: ", i);
				for (j = 0; j < m; j++)
				{
					need[i][j] = max[i][j] - alloc[i][j];
					printf("%4d", need[i][j]);
				}
				printf("\n");
			}

			break;

		case 4:
			if (safe_state())
			{
				printf("\n Given system is in safe state...\n Safe sequence : ");
				for (i = 0; i <= ssi; i++)
					printf("%4d ", safeseq[i]);
			}
			break;

		case 5:
			choice = 5;
			break;

		default:
			printf("Enter valid choice!");
		}
	}
}

safe_state()
{
	int found;

	for (j = 0; j < m; j++)
		work[j] = avail[j];

	for (i = 0; i < n; i++)
		finish[i] = false;

	printf("\n\n Check of safe state...");
	do
	{
		found = false;
		for (i = 0; i < n; i++)
			if (finish[i] == false && need_lte_work(i))
			{
				printf("\n Selected process %d", i);
				finish[i] = true;
				for (j = 0; j < m; j++)
					work[j] = work[j] + alloc[i][j];
				safeseq[++ssi] = i;
				found = true;
			}

		if (found == false)
		{
			for (i = 0; i < n; i++)
				if (finish[i] == false)
					return (false);
			return (true);
		}
	} while (1);
}

need_lte_work(int i)
{
	for (j = 0; j < m; j++)
		if (need[i][j] > work[j])
			return (false);
	return (true);
}