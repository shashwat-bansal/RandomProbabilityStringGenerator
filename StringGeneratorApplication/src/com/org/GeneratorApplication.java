package com.org;

import com.org.interfaces.ProbabilityGenerator;
import com.org.service.ProbabilityGeneratorImpl;

import java.util.Scanner;

public class GeneratorApplication {

    public static void main(String[] args) {

        // init the prob generator
        ProbabilityGenerator probabilityGenerator = new ProbabilityGeneratorImpl("/Users/sbansal2/Desktop/myfile.csv");

        //numberOfTimes : Number of times that method is called. We can have any value for the same
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter numberOfTimes: " );
        int numberOfTimes = myInput.nextInt();

        for(int times=0; times<numberOfTimes; times++) {
            String nextStr = probabilityGenerator.getNextString();
            System.out.println(nextStr);
        }

    }
}
