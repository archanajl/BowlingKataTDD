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
    public void checkCalculateScoreAllRollswithvalidNumbers(){
        String scoreboard = "14 23 44 53 62 81 71 81 23 72";
        int score = bowl.calculateScore(scoreboard);
        Assertions.assertEquals(score, 74);
    }

}
