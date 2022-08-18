#include <stdio.h>
#include <stdlib.h>

void main()
{

    int hit = 0, miss = 0, i, j, noPages = 16, noFrames, min;
    int frames[10];
    int pages[] = {12, 15, 12, 18, 6, 8, 11, 12, 19, 12, 6, 8, 12, 15, 19, 8};
    int flag = 0, flag1 = 0, flag2 = 0;
    int flagFound = 0;
    int count = 0;
    int frameAge[50], frameFREQ[50];

    printf("How many frames : ");
    scanf("%d", &noFrames);

    for (i = 0; i < noFrames; i++)
    {
        frames[i] = -1;
        frameAge[i] = -1;
    }

    for (j = 0; j < noFrames; j++)
        frameFREQ[j] = 0;

    printf("\nPageNo\tPage Fault\tPage Frames");
    printf("\n-------------------------------------------------------\n");

    for (j = 0; j < noPages; j++)
    {
        int index;
        printf("%d\t", pages[j]); // Page : %d\tfault :
        flagFound = 0, flag = 0, flag2 = 0;

        for (i = 0; i < noFrames; i++)
        {
            if (frames[i] == pages[j])
            {
                flagFound = 1;
                flag = 1;
                index = i;
                printf("NO\t");

                hit++;

                break;
            }
        }

        if (flagFound == 0) // if frame not found and empty frame avalible
        {
            for (i = 0; i < noFrames; i++)
            {
                if (frames[i] == -1)
                {
                    frames[i] = pages[j];
                    flag = 1;
                    count++;
                    frameAge[i] = count;

                    miss++;
                    frameFREQ[i] = 1;
                    printf("YES\t");
                    break;
                }
            }

            if (flag == 0)
            {
                int bestmfu = 0;
                for (i = 0; i < noFrames; i++)
                {
                    if (frameFREQ[i] > frameFREQ[bestmfu])
                        bestmfu = i;
                }
                frames[bestmfu] = pages[j];
                miss++;
                printf("YES\t");
                frameFREQ[bestmfu] = 1;
            }

        } // FLAG FOUND ends
        else
        {
            frameFREQ[index]++;
        }

        for (i = 0; i < noFrames; i++)
        {
            printf("\t%d ", frames[i]);
        }
        printf("\n");
    }

    printf("-------------------------------------------------------");
    printf("\nNumber of Page Faults = %d", miss);
}