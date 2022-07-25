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
	int i;

	float *rand_num = NULL;
	rand_num = create_rand_numbers(num_elements_per_proc);

	float globalmax, globalmin;
	for (i = 0; i < num_elements_per_proc; i++)
		printf("%f \t\n", rand_num[i]);

	float max = rand_num[0], min = rand_num[0];
	for (i = 0; i < num_elements_per_proc; i++)
		if (rand_num[i] > max)
			max = rand_num[i];

	MPI_Reduce(&max, &globalmax, 1, MPI_FLOAT, MPI_MAX, 0, MPI_COMM_WORLD);

	for (i = 0; i < num_elements_per_proc; i++)
		if (rand_num[i] < min)
			min = rand_num[i];

	MPI_Reduce(&min, &globalmin, 1, MPI_FLOAT, MPI_MAX, 0, MPI_COMM_WORLD);

	if (world_rank == 0)
		printf("\n global max %f \n global min %f", globalmax, globalmin);
}