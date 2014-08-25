/**
 * File: C.c
 * Created Date: June 12, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task C operations of the task graph.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function declaration
int add(int x, int y);
void taskC(char * inputFileName, char * outputFileName);

int main(int argc, char * argv[]) {
  // Check the argument number
  if (argc != 3) {
    printf("Error - invalid number of arguments\n");
  }

  taskC(argv[1], argv[2]);

  return 0;
}

// Function definitions
int add(int x, int y) {
  return x + y;
}

void taskC(char * inputFileName, char * outputFileName) {
  int result;
  FILE * fpInput;
  FILE * fdOutput;
  fpInput = fopen(inputFileName, "r");  
  fdOutput = fopen(outputFileName, "w");

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
