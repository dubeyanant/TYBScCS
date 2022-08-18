#include <stdio.h>

struct frmnode // struct node
{
	int pno;
} frames[20];

int n; // n is no of frames

int page_found(int pno)
{
	int fno;
	for (fno = 0; fno < n; fno++)
		if (frames[fno].pno == pno)
			return fno; // this returns the position of page which is found

	return -1;
}

int get_free_frame() // to get a free frame
{
	int fno;
	for (fno = 0; fno < n; fno++)
		if (frames[fno].pno == -1) // -1 means a free frame
			return fno;

	return -1;
}

int get_fifo_frame() // to get a fifo frame
{
	static int fno = -1;
	fno = (fno + 1) % n;
	return fno;
}

void main()
{
	int p_request[] = {12, 15, 12, 18, 6, 8, 11, 12, 19, 12, 6, 8, 12, 15, 19, 8}; // pages
	int size = 16;																   // page array length
	int page_falts = 0, i, j, fno;

	printf("How many frames : ");
	scanf("%d", &n); // n is globally declared

	for (i = 0; i < n; i++) // filling all frames with -1
		frames[i].pno = -1;

	printf("\nPageNo\t\tPage Fault\tPage Frames");
	printf("\n-------------------------------------------------------");

	for (i = 0; i < size; i++)
	{
		j = page_found(p_request[i]); // return frame number

		if (j == -1) // page fault occurs
		{
			page_falts++;
			j = get_free_frame();
			if (j == -1) // no free frame - do page replacement
				j = get_fifo_frame();
			frames[j].pno = p_request[i]; // load page in frame

			printf("\n%d\t\tYES\t", p_request[i]); // prints pageNo and YES
		}
		else									  // page found in frame j
			printf("\n%d\t\tNO\t", p_request[i]); // prints pageNo and NO

		for (fno = 0; fno < n; fno++)
			printf("\t%d", frames[fno].pno); // prints page frames
	}

	printf("\n-------------------------------------------------------");
	printf("\nTotal no of page faults : %d", page_falts);
}