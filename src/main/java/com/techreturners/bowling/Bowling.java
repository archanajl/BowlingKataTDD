package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String scoreboard){
        int score =  0;

        String onlyScores = scoreboard.replaceAll("\\s+","");

        for (int i=0; i< onlyScores.length();i++){
            score += Character.getNumericValue(onlyScores.charAt(i));
        }
        return score;
    }
}
