package com.example;

import java.util.ArrayList;
import java.util.List;

public class kmpAlgo{
    Metrics m = new Metrics();

    // main KMP algorithm method
    public List<Integer> kmpAlgo(String pat,String txt){

        long startTime = System.nanoTime();
        List<Integer> matches = new ArrayList<>(); 
        int M = pat.length();
        int N = txt.length();

        // create lps array, lps is 
        int lps[]=new int[M];

        LPS(pat, M, lps);

        // index for text
        int textLenght = 0;

        // index for pattern
        int  patLength = 0;

        // Builds an array lps for the pattern. 
        // lps[i] = length of the maximum proper prefix  
        // pat[0..i]
        // it means first n characters match the last n characters
        while (textLenght<N) {
            m.incComp();

            if(pat.charAt(patLength)==txt.charAt(textLenght)){
                m.incComp();
                patLength++;
                textLenght++;
            }

            if(patLength==M){
                m.incComp();
                matches.add(textLenght-patLength);
                // use lps for unnecessary comparisons
                patLength=lps[patLength-1];
            }else if(textLenght<N && pat.charAt(patLength)!=txt.charAt(textLenght)){
                m.incComp();
                if(patLength!=0){
                    m.incComp();
                    patLength=lps[patLength-1]; // "jump" using lps
                }
                else{
                    textLenght++; // move text forward
                }
            }
            
        }

        long endTime = System.nanoTime();

        double excTime = (endTime - startTime) / 1_000_000.0;
        return matches;

    }

    //compute the longest prefix suffix(lps) array
    public void LPS(String pat, int M, int lps[]){
        int len = 0; // lenght of the previous lps
        int i = 1;
        lps[0] = 0;

        while(i<M){
            m.incComp();
            if(pat.charAt(i)==pat.charAt(len)){
                m.incComp();
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    m.incComp();
                    len = lps[len-1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}