// compile : mpicc <name of .c file>
// run : mpirun -np <no. of processors> <name of executable>

#include <stdio.h>
#include <mpi.h>
#include <stdlib.h>
#include <time.h>

float *create_rand_numbers(int num_element)
{
	float *rand_num = (float *)malloc(sizeof(float) * num_element);
	int i;
	for (i = 0; i < num_element; i++)
		rand_num[i] = rand() % 100;

	return rand_num;
}

int main(int argc, char **argv)
{
	int num_elements_per_proc = atoi(argv[1]);

	MPI_Init(NULL, NULL);

	int world_size;
	MPI_Comm_size(MPI_COMM_WORLD, &world_size);
	int world_rank;
	MPI_Comm_rank(MPI_COMM_WORLD, &world_rank);

	srand(time(NULL) * world_rank);
	float *rand_num = NULL;
	rand_num = create_rand_numbers(num_elements_per_proc);

	float localsum = 0;
	int i;

	for (i = 0; i < num_elements_per_proc; i++)
	{
		printf("%f \t\n", rand_num[i]);
		localsum += rand_num[i];
	}

	printf("%f is local sum for process %d\nLocal Average %f\n", localsum, world_rank, localsum / num_elements_per_proc);

	float globalsum;
	MPI_Reduce(&localsum, &globalsum, 1, MPI_FLOAT, MPI_SUM, 0, MPI_COMM_WORLD);

	if (world_rank == 0)
		printf("\n global %f \n global average %f \n", globalsum, globalsum / (world_size * num_elements_per_proc));
}