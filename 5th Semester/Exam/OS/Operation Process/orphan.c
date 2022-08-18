#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main()
{
	pid_t pid;
    pid = fork();
    
    if(pid > 0)
    {
        printf("Parent process id : %d\n", getpid());
        sleep(1);
    }
    else if(pid == 0)
    {
    	printf("Child process id : %d\nParent process id : %d\n", getpid(), getppid());
		sleep(1);
		printf("\nChild process id : %d\nParent process id : %d\n", getpid(), getppid());
		sleep(1);
    }
    else
    	return 0;
}
