package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String scoreboard){
        int score =  0;

        String onlyScores = scoreboard.replaceAll("\\s+","");

        for (int i=0; i< onlyScores.length();i++){
            if (onlyScores.charAt(i) == '/'){
                if ( i == onlyScores.length()-2){
                    score +=  10 - Character.getNumericValue(onlyScores.charAt(i-1)) ;
                }else {
                    score += Character.getNumericValue(onlyScores.charAt(i + 1)) + 10 - Character.getNumericValue(onlyScores.charAt(i - 1));
                }
            }
            else if (onlyScores.charAt(i) != '-'){
                score += Character.getNumericValue(onlyScores.charAt(i));
            }
        }
        return score;
    }
}
