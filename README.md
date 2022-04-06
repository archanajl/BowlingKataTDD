# _BowlingKataTDD_

### <ins>Goal of the application</ins>
   
   BowlingKataTDD calculates the score of the Ten Pin Bowling Game. Click [here](https://codingdojo.org/kata/Bowling/) to have more details.

### <ins>Rules of the game</ins>

We can briefly summarize the scoring for this form of bowling:

  - Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
  - In each frame, the bowler gets up to two tries to knock down all the pins.
  - If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
  - If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
  - If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
  - If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
  - The game score is the total of all frame scores.

### <ins>Key Features of the application</ins>

  The application takes care of all the cases where the strike and spare comes separately.

  (When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)

  9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
  5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150

### <ins>Approach to the solution</ins>

  - Step One:

  As it is a TDD based application, I started off by writing a basic testcase of reading just one frame of valid numerical values
  
  - Step Two:
  
  As a next step I also included more frames and added different scenarios of valid values till 10 frames
  
  - Step Three:
  
  Implemented the 'miss' scenarios where the input is '-' and we don't add any value. These were also test driven.
  
  - Step Four:
  
  Implemented the 'spare' scenario. It is given as '/'. In this case, first I included the spare ones in the start and middle of the frames.
  I had to remove the previous value and add 10 to it. To this I have to add the next throw's value as well. 
  The next value will be added as a new throw as well.
  If the spare appears as the last entry, the user gets an extra throw. But in this case, To this I have to add the next throw's value as well.
  But as it is a spare throw, we need not consider it as next throw and add it.
  From simple scenario to this test 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 , made sure the test case passed.
  
  - Step Five:
  
  Implemented the 'strike' scenario. It is given as 'X'. In this case, first I included the strike ones in the start and middle of the frames.
  I had to add 10 and add the next two throw's values as well. These throws values will be added in the loop as well.
  If the spare appears as the last entry, the user gets an extra two throws. in this case, To this I have to add the next two throws' value as well.
  But as it is an extra throw, we need not consider it as next two throws and add it in the flow.

  - Yet to be done:
 
   Handle the golden game scenario
   X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
   Also handle the cases where the stike is followed by a spare or another strike.

### <ins> Testcases </ins>

Please click [here](https://htmlpreview.github.io/?https://github.com/archanajl/BowlingKataTDD/blob/master/Test%20Results%20-%20BowlingTest.html) to see the test results.
### <ins>Technologies Used</ins>

    Java
    maven
    JUnit 5

### <ins>How to run the application and tests</ins>

To run the tests, use the following command:

    mvn test
    
