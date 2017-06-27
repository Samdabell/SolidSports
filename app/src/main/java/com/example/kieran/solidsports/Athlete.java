package com.example.kieran.solidsports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by Kieran on 27/06/2017.
 */

public abstract class Athlete {

    int distanceRun;

    public Athlete(){
        this.distanceRun = 0;
    }

    public void enterEvent(){
        prepare();
        compete();
        calculatePoints();
        awardMedal();

    }

    public void prepare(){
        System.out.println("Training montage...");
    }

    public void compete(){
        System.out.println("Beating all the scrubs");
    }

    public abstract int calculatePoints();

    public void awardMedal(){
        if (calculatePoints() >= 15){
            System.out.println("Gold awarded");
        }
        else if (calculatePoints() >= 10){
            System.out.println("Silver awarded");
        }
        else if (calculatePoints() >= 5){
            System.out.println("Bronze awarded");
        }
        else {
            System.out.println("NO MEDAL 4 U, SCruB");
        }
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void runningSession(int distance) {
        distanceRun += distance;
//        System.out.println(String.format("Athlete ran %d km", distance));
//        System.out.println(String.format("Total distance run: %d km", distanceRun));
//
//        try (PrintWriter out = new PrintWriter(new FileOutputStream(new File("distancerun.txt"),true))) {
//            out.println(String.format("Athlete ran %d km", distance));
//            out.println(String.format("Total distance run: %d km", distanceRun));
//            out.close();
//        } catch (FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
    }
}
