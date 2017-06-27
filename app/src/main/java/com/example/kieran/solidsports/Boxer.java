package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

    public Boxer(int hitsGiven, int hitsTaken){
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int calculatePoints(){
        return hitsGiven - hitsTaken;
    }



}
