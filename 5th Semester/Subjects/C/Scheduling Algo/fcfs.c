#include <stdio.h>
#include <stdlib.h>
struct proc_info
{ 
	int atime;
 	int cpub;
} proc[20];
struct rqnode
{ 
	int pid;
 	struct rqnode *link;
} *first=NULL, *curr, *prev, *last;
struct ganttchart
{ 
	int stime;
 	int pid;
 	int etime;
} gchart[20];

int i,n,ctime,gi=0,wtime[20],ttime[20];
void getprocs();
void start();
void addprocq();
void attachtoq(int );
void addgchart(int);
void dispgchart();
void disptimes();

void main()
{
	 getprocs();
	 ctime=0; //set current time to 0
	 start();
	 dispgchart();
	 disptimes();
}
void getprocs()
{ printf("\nHow many processes: "); scanf("%d",&n);
	 printf("\nPID\tATIME\tCPUB\n");
	 for (i=1; i<=n; i++)
	 { 
		printf("%d\t",i);
	 	scanf("%d%d",&proc[i].atime,&proc[i].cpub);
 	 }
}//get_proc
void start()
{ 
	int pid;
 	addprocq(); //add procs in rq arrived at ctime
 	pid=getfirstproc();//get FCFS process
 	while(!finished()) //while not finished all processes
 	{
 		if(pid!=-1)
 		{ //execute process pid
 		ctime++; //increment current time
 		proc[pid].cpub--;
 		if(proc[pid].cpub==0)//proc finished
 		{
		printf("\nProc %d completed at time %d..",pid,ctime);
		ttime[pid]=ctime-proc[pid].atime;
		pid=getfirstproc();//get FCFS process
 		}//if
 	}//if
 	else
 	ctime++;//no process in rq
 	addprocq(); //add procs in rq arrived at ctime
}//while
	gchart[gi].etime=ctime;
}//start

void addprocq()
{
 	for(i=1;i<=n;i++)
 	{
		 if(proc[i].atime==ctime) //attach proc to rq
 		attachtoq(i);
 	}//for
}//addprocq

void attachtoq(int pid)
{
	curr=(struct rqnode *)malloc(sizeof(struct rqnode));
 	curr->pid=pid;curr->link=NULL;
 	if(first==NULL)
 		first=curr;
 	else
 		last->link=curr;
 		last=curr;
}

int finished() //check all proc finished cpub
{
 	for(i=1;i<=n;i++)
 	{
	 if(proc[i].cpub!=0)
	 return(0);
 	}
 	return(1);
}

int getfirstproc()
{
	 int pid;
	 if(first==NULL)
	 return(-1);
	 pid=first->pid;
	 curr=first; //remove from rq
	 first=first->link;
	 free(curr);
	 addgchart(pid);
	 wtime[pid]=ctime-proc[pid].atime;
	 return(pid);
}//getfirstproc
void addgchart(int pid)
{
	 gchart[++gi].pid=pid;
	 gchart[gi].stime=ctime;
	 gchart[gi-1].etime=gchart[gi].stime;
}
void dispgchart()
{
	 printf("\n");
	 for(i=1;i<=gi;i++)
	 printf("|-------");
	 printf("|\n");
	 for(i=1;i<=gi;i++)
	 printf("| %d\t ",gchart[i].pid);
	 printf("|\n");
	 for(i=1;i<=gi;i++)
	 printf("|-------");
	 printf("|\n");
	 for(i=1;i<=gi;i++)
	 printf("%d\t ",gchart[i].stime);
	 printf("%d\n",gchart[gi].etime);
}
void disptimes()
{ int sumwt=0,sumtt=0,pid;
	 printf("\n**Waiting Time**");
	 printf("\nPID\tWtime");
	 for(i=1;i<=n;i++)
	 {
	 printf("\n%d\t%d",i,wtime[i]);
	 sumwt+=wtime[i];
	 }
	 printf("\nAverage:%.2f",(float)sumwt/n);
	 printf("\n**Turnaround Time**");
	 printf("\nPID\t ttime");
	 for(i=1;i<=n;i++)
	 {
	 printf("\n%d\t%d",i,ttime[i]);
	 sumtt+=ttime[i];
	 }
	 printf("\nAverage:%.2f",(float)sumtt/n);
}
