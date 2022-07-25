#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 200

typedef struct dir
{
	char fname[20];
	int index_no, no_of_entries;
	struct dir *next;
} NODE;

NODE *first, *last;
int bit[MAX], n;

void init()
{
	int i;
	printf("Enter total no of blocks : ");
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		bit[i] = rand() % 2;
	}
}

void show_bitVector()
{
	int i;
	for (i = 0; i < n; i++)
	{
		printf("%d", bit[i]);
	}
	printf("\n");
}

void show_dir()
{
	NODE *p;
	printf("File\tIndex\tEntries");
	p = first;
	while (p != NULL)
	{
		printf("\n%s\t%d\t%d\n", p->fname, p->index_no, p->no_of_entries);
		p = p->next;
	}
}

void create()
{
	NODE *p;
	char fname[20];
	int nob, i = 0, j = 0, index_no;
	printf("Enter file name : ");
	scanf("%s", fname);
	printf("Enter no of blocks : ");
	scanf("%d", &nob);

	while (1)
	{
		while (i < n)
		{
			if (bit[i] == 0)
				break;
			i++;
		}
		if (i < n)
		{
			index_no = i;
			j = 1;
			while (j < nob && i < n && bit[i] == 0)
			{
				i++;
				j++;
			}
			if (j = nob)
			{
				p = (NODE *)malloc(sizeof(NODE));
				strcpy(p->fname, fname);
				p->index_no = index_no;
				p->no_of_entries = nob;
				p->next = NULL;
				if (first == NULL)
					first = p;
				else
					last->next = p;
				last = p;
				for (j = 0; j < nob; j++)
					bit[j + index_no] = 1;
				printf("File %s created successfully\n", fname);
				return;
			}
		}
		else
		{
			printf("Failed to create file %s\n", fname);
			return;
		}
	}
}

void delete ()
{
	NODE *p, *q;
	char fname[20];
	int i;

	printf("Enter file to be deleted : ");
	scanf("%s", fname);
	p = q = first;

	while (p != NULL)
	{
		if (strcmp(p->fname, fname) == 0)
			break;
		q = p;
		p = p->next;
	}
	if (p == NULL)
	{
		printf("File %s not found.\n", fname);
		return;
	}
	for (i = 0; i < p->no_of_entries; i++)
		bit[p->index_no + i] = 0;
	if (p == first)
		first = first->next;
	else if (p == last)
	{
		last = q;
		last->next = NULL;
	}
	else
	{
		q->next = p->next;
	}
	free(p);
	printf("File %s deleted successfully.\n", fname);
}

int main()
{
	int ch;
	init();
	while (1)
	{
		printf("1.Show Bit Vector\n");
		printf("2.Create new file\n");
		printf("3.Show Directory\n");
		printf("4.Delete file\n");
		printf("5.Exit\n");

		printf("\nEnter your choice : ");
		scanf("%d", &ch);

		switch (ch)
		{
		case 1:
			show_bitVector();
			break;
		case 2:
			create();
			break;
		case 3:
			show_dir();
			break;
		case 4:
			delete ();
			break;
		case 5:
			exit(0);
		}
	}
	return 0;
}
