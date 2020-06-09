# RandomProbabilityStringGenerator
This java program ingests a csv file containing a String and its output probability and then prints the randomised string. The program creates a arraylist of input contents and uses cumulative probability property while ingesting the file. A random number between 0 and 1 is generated and matched against cumulative probability of input string.

Sample file: 
probabilities.csv   
This is a sample string,0.56  
This is another string,0.30   
This is yet another string,0.1  
Least occurring string,0.04 

The probabilities would sum to 1. 
Each string won't be longer than 1000 characters and the file will contain a maximum of 100 strings.  

Constraints 
0<lengthOfString<=1000  
0<sizeOfTotalString<=100  

Assumptions:  
1. Input file path is valid.
2. Input file contents are valid. 

