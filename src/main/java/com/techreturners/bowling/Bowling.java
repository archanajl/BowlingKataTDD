package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String scoreboard){
        int score =  0;
        for (int i=0; i< scoreboard.length();i++){
            score += Character.getNumericValue(scoreboard.charAt(i));
        }
        return score;
    }
}
