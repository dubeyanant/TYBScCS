#include <stdio.h>
#include <sys/types.h>

void ChildProcess()
{
    printf("I am a child process...");
}

void ParentProcess()
{
    printf("I am a parent process...");
}

void main()
{
    pid_t pid;
    pid = fork();
    if (pid == 0)
    {
    	ChildProcess();
        printf("Process ID : %d\n", pid);
    }
    else
    {
    	ParentProcess();
        printf("Process ID : %d\n", pid);
        sleep(1);
    }
}
