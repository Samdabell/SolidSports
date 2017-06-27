package com.example.kieran.solidsports;

import android.util.Printer;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

    public Boxer(Printing printer, int hitsGiven, int hitsTaken){
        super(printer);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int calculatePoints(){
        return hitsGiven - hitsTaken;
    }



}
