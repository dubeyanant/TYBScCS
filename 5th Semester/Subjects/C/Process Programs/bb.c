#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main()
{
    int pid=fork();
    if(pid>0)
    {
        printf("Parent process id : %d\n", getpid());
        sleep(1);
    }
    else if(pid==0)
        printf("Child process id %d\nParent id : %d\n", getpid(), getppid());
    else
    	return 0;
}
