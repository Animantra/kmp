package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        kmpAlgo kmp = new kmpAlgo();

        //Short Text
        String text1 = "ABABABC";
        String pattern1 = "ABAB";

        List<Integer> result1 = kmp.kmpAlgo(pattern1, text1);

   
        // Medium String
        String text2 = "AABACAADAABAСAABAAABACAAABA";
        String pattern2 = "AABAС";

        List<Integer> result2 = kmp.kmpAlgo(pattern2, text2);

    
        //Long String
        String text3 = "AABACAADAABAAABAAABACAAABAAABACAAABAAABAC";
        String pattern3 = "AAABAC";

        List<Integer> result3 = kmp.kmpAlgo(pattern3, text3);


    }
}
