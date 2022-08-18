#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char comm[100], *ptr, *args[10];
int tot;

int count(char* option, char* fname);

main()
{
	do
	{
		printf("myshell$ ");
		getcomm();
		sep_arg();
		take_action();
		printf("\n");
	} while(1);
}

sep_arg()
{
	char* token;
	tot = 0;
	
	token = strtok(comm, " ");
	
	while(token != NULL)
	{
		args[tot] = (char*)malloc(20);
		strcpy(args[tot++], token);
		token = strtok(NULL, " ");
	}
	return;
}

getcomm()
{
	int len;
	
	ptr = fgets(comm, 80, stdin);
	len = strlen(comm);
	comm[len-1] = '\0';
	return;
}

take_action()
{
	ptr = comm;
	if(ptr == NULL)
		exit(0);
		
	if(strlen(comm) <= 1)
		return;
	else if(strcmp(args[0],"count") == 0)
		count(args[1], args[2]);
	else
	{
		printf("Command not found!");
		exit(0);
	}
}

int count(char* option, char* fname)
{
	int ccnt, wcnt, lcnt, wflag, ch;
	FILE *fp;
	
	fp = fopen(fname,"r");
	if(fp == NULL)
	{
		printf("Unable to open file!");
		exit(0);
	}
	
	ccnt = wcnt = lcnt = wflag = 0;
	ch = fgetc(fp);
	
	while(ch != EOF)
	{
		ccnt++;
		if(ch == ' ' || ch == '\t')
		{
			if(wflag == 0)
			{
				wcnt++;
				wflag = 1;
			}
		}
		else if(ch == '\n')
		{
			lcnt++;
			if(wflag == 0)
			{
				wcnt++;
				wflag = 1;
			}
		}
		else
			wflag = 0;
			
		ch = fgetc(fp);
	}
	
	if(wflag == 0)
	{
		wcnt++;
		lcnt++;
	}
	
	fclose(fp);
	
	if(strcmp(option,"c") == 0)
		printf("\nTotal characters = %d\n", ccnt);
	else if(strcmp(option,"w") == 0)
		printf("\nTotal words = %d\n", wcnt);
	else if(strcmp(option,"l") == 0)
		printf("\nTotal lines = %d\n", lcnt);
	else
		printf("\nInvalid option!\n");
}
