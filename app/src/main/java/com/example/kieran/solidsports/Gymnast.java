package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(Printing printer, int difficulty, int execution){
        super(printer);
        this.difficulty = difficulty;
        this.execution = execution;
    }

    public int calculatePoints(){
        return difficulty + execution;
    }


}
