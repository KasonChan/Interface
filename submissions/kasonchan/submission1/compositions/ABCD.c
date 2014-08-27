/**
 * File: A.c
 * Created Date: June 26, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the tasks A, B, C and D operations of the 
 * task graph.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct threadArgs {
  char * inputFileName;
  char * outputFileName;
};

// Function declaration
int add(int x, int y);
int subtract(int x, int y);
int multiply(int x, int y);
void taskA(char * inputFileName, char * outputFileName);
void * taskB(void * threadArgs);
void * taskC(void * threadArgs);
void taskD(char * inputFileName1, char * inputFileName2, char * outputFileName);

int main(int argc, char * argv[]) {
  // Check the argument number
  if (argc != 6) {
    printf("Error - invalid number of arguments\n");
  }

  taskA(argv[1], argv[2]);

  // Declare 2 threads
  pthread_t taskBThread;
  pthread_t taskCThread;

  // Allocate memory for threads arguments
  struct threadArgs *taskBArgs = malloc(sizeof(struct threadArgs));
  struct threadArgs *taskCArgs = malloc(sizeof(struct threadArgs));

  // Define taskB and taskC arguments
  taskBArgs->inputFileName = argv[2];
  taskBArgs->outputFileName = argv[3];
  taskCArgs->inputFileName = argv[2];
  taskCArgs->outputFileName = argv[4];

  pthread_create(&taskBThread, NULL, taskB, taskBArgs);
  pthread_create(&taskCThread, NULL, taskC, taskCArgs);

  pthread_join(taskBThread, NULL);
  pthread_join(taskCThread, NULL);

  taskD(argv[3], argv[4], argv[5]);

  return 0;
}

// Function definitions
int add(int x, int y) {
  return x + y;
}

int subtract(int x, int y) {
  return x - y;
} 

int multiply(int x, int y) {
  return x * y;
}

void taskA(char * inputFileName, char * outputFileName) {
  int result;
  FILE * fpInput;
  FILE * fdOutput;
  fpInput = fopen(inputFileName, "r");  
  fdOutput = fopen(outputFileName, "w");

  // Read from input file
  fscanf (fpInput, "%d", &result); 

  // Write output to file
  fprintf(fdOutput, "%d\n", result);
  
  // Close files
  fclose(fpInput);
  fclose(fdOutput);
}

void * taskB(void * threadArgs) {
  int result;
  FILE * fpInput;
  FILE * fdOutput;
  fpInput = fopen(((struct threadArgs *) threadArgs)->inputFileName, "r");  
  fdOutput = fopen(((struct threadArgs *) threadArgs)->outputFileName, "w");

  // Read from input file
  fscanf (fpInput, "%d", &result); 

  // Perform subtraction
  result = subtract(result, 1);

  // Write output to file
  fprintf(fdOutput, "%d\n", result);
  
  // Close files
  fclose(fpInput);
  fclose(fdOutput);
}

void * taskC(void * threadArgs) {
  int result;
  FILE * fpInput;
  FILE * fdOutput;
  fpInput = fopen(((struct threadArgs *) threadArgs)->inputFileName, "r");  
  fdOutput = fopen(((struct threadArgs *) threadArgs)->outputFileName, "w");

  // Read from input file
  fscanf (fpInput, "%d", &result); 

  // Perform addition
  result = add(result, 1);

  // Write output to file
  fprintf(fdOutput, "%d\n", result);
  
  // Close files
  fclose(fpInput);
  fclose(fdOutput);
}

void taskD(char * inputFileName1, char * inputFileName2, char * outputFileName) {
  int input1;
  int input2;
  int result;
  FILE * fpInput1;
  FILE * fpInput2;
  FILE * fdOutput;
  fpInput1 = fopen(inputFileName1, "r");  
  fpInput2 = fopen(inputFileName2, "r");  
  fdOutput = fopen(outputFileName, "w");

  // Read from input file 1
  fscanf (fpInput1, "%d", &input1); 

  // Read from input file 2
  fscanf (fpInput2, "%d", &input2); 

  // Perform addition
  result = multiply(input1, input2);

  // Write output to file
  fprintf(fdOutput, "%d\n", result);
  
  // Close files
  fclose(fpInput1);
  fclose(fpInput2);
  fclose(fdOutput);
}
