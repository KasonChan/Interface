/**
 * File: D.c
 * Created Date: June 12, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task D operations of the task graph.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Functions declarations
int multiply(int x, int y);
void taskD(char * inputFileName1, char * inputFileName2, char * outputFileName);

int main(int argc, char * argv[]) {
  // Check the argument number
  if (argc != 4) {
    printf("Error - invalid number of arguments\n");
  }

  taskD(argv[1], argv[2], argv[3]);

  return 0;
}

// Functions definitions
int multiply(int x, int y) {
  return x * y;
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
