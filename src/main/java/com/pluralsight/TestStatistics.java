package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {54,67,99,32,78,23,88,97,50,79};
        Arrays.sort(testScores);

        double sum = 0;

        double highScore = testScores[testScores.length -1];
        double lowScore = testScores[0];

        for (int testScore : testScores) {
            sum += testScore;
        }

        double average = sum / testScores.length;
        double median = (testScores[testScores.length / 2 - 1]
                + testScores[testScores.length / 2]) / 2.0;

        System.out.println("The sum is = " + sum);
        System.out.println("The average is = " + average);
        System.out.println("The highScore = " + highScore);
        System.out.println("The lowScore = " + lowScore);
        System.out.println("The median = " + median);

    }
    /*public static void calculateMedian(Array test, int length){
        if (length % 2 == 0){
            median = Arrays.this.length() /2*/


}
