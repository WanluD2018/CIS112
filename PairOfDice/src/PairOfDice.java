/*
    @author Wanlu Ding
 */

import java.util.Random;

public class PairOfDice {

    private int die1;
    private int die2;

    // constructor
    public PairOfDice(){
        roll();
    }

    public void roll() {
        Random rand = new Random();
        this.die1 = rand.nextInt(6) + 1;
        this.die2 = rand.nextInt(6) + 1;
    }

    // getters
    public int getDie1(){
        return die1;
    }

    public int getDie2() {
        return die2;
    }
    
    public int value(){
        return die1 + die2;
    }

    public String toString(){
        return die1 + " : " + die2 + " = " + value();
    }

}
