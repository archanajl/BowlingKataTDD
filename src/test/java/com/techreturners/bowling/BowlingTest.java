package com.techreturners.bowling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BowlingTest {

    Bowling bowl = new Bowling();

    @Test
    public void checkCalculateScoreWithOneRollValue(){
        String scoreboard = "14";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 5);
    }

    @Test
    public void checkCalculateScoreTwoRollswithvalidNumbers(){
        String scoreboard = "14 23";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 10);
    }

    @Test
    public void checkCalculateScoreFiveRollswithvalidNumbers(){
        String scoreboard = "14 23 44 53 62 ";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 34);
    }

    @Test
    public void checkCalculateScoreAllRollswithvalidNumbers(){
        String scoreboard = "14 23 44 53 62 81 71 81 23 72";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 74);
    }

    @Test
    public void checkCalculateScoreOneRollwithBothMiss(){
        String scoreboard = "--";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 0);
    }

    @Test
    public void checkCalculateScoreOneRollwithOneMiss(){
        String scoreboard = "-4";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 4);
    }

    @Test
    public void checkCalculateScoreTwoRollswithMiss(){
        String scoreboard = "14 -3";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 8);
    }

    @Test
    public void checkCalculateScoreFiveRollswithMiss(){
        String scoreboard = "14 -3 4- 53 62 ";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 28);
    }

    @Test
    public void checkCalculateScoreAllRollswithMiss(){
        String scoreboard = "14 23 -4 53 62 81 71 81 23 -2";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 63);
    }

    @Test
    public void checkCalculateScoreWithOneRollWithSpare(){
        String scoreboard = "1/ 4";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 14);
    }

    @Test
    public void checkCalculateScoreTwoRollswithSpare(){
        String scoreboard = "1/ 23";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 17);
    }

    @Test
    public void checkCalculateScoreAllRollswithSpare(){
        String scoreboard = "14 23 -4 53 62 81 71 8/ 23 -2";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 66);
    }

    @Test
    public void checkCalculateScoreAllRollswithSpares(){
        String scoreboard = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 150);
    }
}
