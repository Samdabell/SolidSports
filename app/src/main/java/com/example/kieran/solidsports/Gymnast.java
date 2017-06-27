package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(int difficulty, int execution){
        this.difficulty = difficulty;
        this.execution = execution;
    }

    public int calculatePoints(){
        return difficulty + execution;
    }


}
