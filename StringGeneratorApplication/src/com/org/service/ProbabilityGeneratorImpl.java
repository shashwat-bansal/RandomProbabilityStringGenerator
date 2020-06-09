package com.org.service;

import com.org.interfaces.ProbabilityGenerator;
import com.org.model.ProbabilityEntity;

import java.io.*;
import java.util.*;

import static com.org.utils.Utility.randomNumberGenerator;

public class ProbabilityGeneratorImpl implements ProbabilityGenerator {

    private ArrayList<ProbabilityEntity> input;

    public ProbabilityGeneratorImpl(String path){
        readAndIngestFile(path);
    }
    //Function to ingest file contents
    private void readAndIngestFile(String path){
        input =new ArrayList<>();
        File inputFile = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            float probabilitySum = 0.00f;
            while ((line = br.readLine()) != null) {
                String[] arrOfStr = line.split(",", 2);
                ProbabilityEntity pe = new ProbabilityEntity();
                pe.setOutputStr(arrOfStr[0]);
                pe.setProbability(probabilitySum + Float.parseFloat(arrOfStr[1]));
                probabilitySum=pe.getProbability();
                input.add(pe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNextString(){
        String result = null;
        float randomNumber = randomNumberGenerator();
        for (ProbabilityEntity pe : input) {
            if(randomNumber < pe.getProbability()){
                result = pe.getOutputStr();
                break;
            }
        }
        return result;
    }
}
